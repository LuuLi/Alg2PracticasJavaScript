package aye2.practica9.Matricula;
/*Implemente una clase MatriculaAuto (matrícula de automóvil) que va a estar
formada por dos atributos letra y número. En el método main se deberán crear
objetos matrículas, a partir de sus componentes. La matrícula se considerará
valida si la letra introducida es igual a la letra ‘A’ o ‘B’, y si el número tiene
ocho dígitos. Si la matrícula fuera correcta se creará un objeto matrícula y se
mostrarán por pantalla los valores de sus atributos. En caso de que la letra sea
incorrecta o el número de matrícula no tuviera ocho dígitos, se lanzará una
excepción. El método llamador deberá mostrar un mensaje ante la excepción
recibida indicando que la letra es errónea o el formato es erróneo, dependiendo
de la situación ocurrida.
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