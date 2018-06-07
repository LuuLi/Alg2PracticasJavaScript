package aye2.practica9.Matricula;
/*Implemente una clase MatriculaAuto (matr�cula de autom�vil) que va a estar
formada por dos atributos letra y n�mero. En el m�todo main se deber�n crear
objetos matr�culas, a partir de sus componentes. La matr�cula se considerar�
valida si la letra introducida es igual a la letra �A� o �B�, y si el n�mero tiene
ocho d�gitos. Si la matr�cula fuera correcta se crear� un objeto matr�cula y se
mostrar�n por pantalla los valores de sus atributos. En caso de que la letra sea
incorrecta o el n�mero de matr�cula no tuviera ocho d�gitos, se lanzar� una
excepci�n. El m�todo llamador deber� mostrar un mensaje ante la excepci�n
recibida indicando que la letra es err�nea o el formato es err�neo, dependiendo
de la situaci�n ocurrida.
*/
public class matriculaAuto {
	private char letra;
	private int numero;
	private boolean esValido;
	
	public matriculaAuto() throws matriculaAutoException{
		
		public setLetra(char letra) {
			try{
				if (letra != 'A' && letra != 'B') {
			
			throw new LetraInvalidaException("La letra (" + letra + ") es invalida"); //excepciones; se ingresa mal un valor
		}
				this.letra =letra;
			}catch (LetraInvalidaException e) {
				System.out.println("LetraInvalida");
				this.letra='_';
			}
			public setNumero (String digitos){
				try{
		if (digitos.length() != 8) {
			throw new CantidadDigitosInvalida("La cant de digitos(" + digitos.length() + ")es invalida");
		}
		numero = Integer.parseInt(digitos);//si la cadena tiene una letra manda una exception runtime
		this.letra = letra;
		}catch (CantidadDigitosInvalida e) {
			System.out.println("El numero es invalido");
			esValido=false;
		}catch (NumberFormatException e) {
			System.out.println("El numero no tiene 8 digitos");
		esValido=false;
		}
		}
	public boolean esValido () {
		return esValido;
	}
	@Override
	public String toString() {
		return "Matricula Auto: " + letra + "-" + numero;
	}
	public static void main(String[] args) {
		
		matriculaAuto mat;
	
		try {
		mat = new matriculaAuto('A', "12345678");
		System.out.println(mat);
	} catch (matriculaAutoException e) {
	System.out.println("Error de instanciacion: " + e);
		//e.printStackTrace();
	}catch(NumberFormatException e) {
		System.out.println("Error en formato de numero");
		System.out.println(e);
	}
		//version con validacion por metodos
		
		
		matriculaAuto nat2 = new matriculaAuto();
		mat2.setLetra('A');
		mat2.setNumero"(87434943");
		if (mat2.esValido()){
			System.out.println(mat2);
		}
		}
			
		}
		System.out.println("Termina ok");
}
}