package PracticaParcial;

public class Automotor extends Bien implements Asegurable, Transferible, Gravable {
	private float prima;
	private float alicuota;
	
	@Override
	public void setAlicuota(float alicuota) throws AlicuotaInvalidaException {
		if (alicuota <= 0 ) {
			throw new AlicuotaInvalidaException();
		}
		this.alicuota = alicuota;	
	}
	@Override
	public float getAlicuota() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float calcularImpuesto() {
		return alicuota*valorFiscal;
	}

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
}
