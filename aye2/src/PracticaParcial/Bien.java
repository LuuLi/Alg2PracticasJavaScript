package PracticaParcial;

import javax.xml.bind.helpers.ValidationEventLocatorImpl;

public abstract class Bien implements Asegurable, Transferible,Gravable{
	protected Titular titular;
	protected float valorMercado;
	protected float valorFiscal;
	protected int codigo;
	protected static int proximoCodigo = 0;
	private float prima;
	private float alicuota;
	
	public Bien() {
		codigo = proximoCodigo;
		proximoCodigo++;
		
	}
	public Bien (Titular titular) {
		this();
		this.titular = titular;
	}
	public void setValorMercado(float valor) throws ValorMercadoInvalidoException {
		 if (valor<0) {
			 throw new ValorMercadoInvalidoException();
		 }
		 valorMercado = valor;		
	}
	public void setValorFiscal(float valor) throws ValorFiscalInvalidoException {
		 if (valor<0) {
			 throw new ValorFiscalInvalidoException();
		 }
		 valorFiscal = valor;		
	}
	public float getValorMercado() {
		return valorMercado;
	}
	//metodos de gravable
	public void setAlicuota(float alicuota) throws AlicuotaInvalidaException {
		if (alicuota <= 0 ) {
			throw new AliuotaInvalidaException();
		}
		this.alicuota = alicuota;	
	}
	@Override
	public float getAlicuota() throws OperacionNoSoportadaException{
		if(this instanceof Gravable) {
			return alicuota;
	}
	throw new OperacionNoSoportadaException();
	}
	@Override
	public float calcularImpuesto() {
		return alicuota*valorFiscal;
	}
	//metodos de transferible
@Override
	public void transferir(Titular nuevoTitular) throws TransferenciaInvalidaException{
		if (titular.equals(nuevoTitular)) {
			throw new TransferenciaInvalidaException();
		} try {
		Empresa.notificarTransferencia(titular,codigo); 
		}catch(EmailNotSentException e) {
			System.out.println("Email no enviado");
		}
		titular = nuevoTitular;
	}
	//metodos de asegurable
	@Override
	public void setPrima(float prima) throws PrimaInvalidaException {
		if(prima < 0 || prima > valorMercado) {
			throw new PrimaInvalidaException();
		}
		this.prima = prima;
	}
	@Override
	public float getPrima() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void asignarTitular(Titular titular) {
		this.titular = titular;
	}

	public boolean equals(Bien bien2) {
		return codigo == bien2.getCodigo();
	}
	private int getCodigo() {
		return codigo;
	}
	public Object getTitular() {
		return titular;
	}

}
