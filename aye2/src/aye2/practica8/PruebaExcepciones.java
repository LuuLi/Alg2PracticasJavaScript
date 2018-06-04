package aye2.practica8;

import java.util.Scanner;

public class PruebaExcepciones {
	private static final int SIZE_ARREGLO = 10;

	public static void main(String[] args) {
		Integer[] arregloInt = new Integer[SIZE_ARREGLO];			
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el indice: ");
		int indice = teclado.nextInt(); //string d datos q se pasa a entero
		arregloInt[indice] = 15;
		System.out.println("Termina OK");
	}

}
