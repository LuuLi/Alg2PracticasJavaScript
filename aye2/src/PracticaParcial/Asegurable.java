package PracticaParcial;

public interface Asegurable {

	public void setPrima(float prima) throws PrimaInvalidaException; // no es necesario poner public en las interfaces
	float getPrima() ;
	
}
