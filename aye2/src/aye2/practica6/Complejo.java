package aye2.practica6;

public class Complejo {
	private int i1,i2;
	private float f1,f2;
	private double d1,d2;
	private static double suma;
	
	public Complejo() {
		i1 = 0;
		i2 = 0;
		f1 = 0;
		f2 = 0;
		d1 = 0;
		d2 = 0;
	}
	public Complejo(int entero1 , int entero2) {
		i1 = entero1;
		i2 = entero2;		
	}
	public Complejo(float real1, float real2) {
		f1 = real1;
		f2 = real2;
	}
	public Complejo(double complejo1, double complejo2  ) {
		d1 = complejo1;
		d2 = complejo2;
	}
	public int getI1() {
		return i1;
	}
	public void setI1(int i1) {
		this.i1 = i1;
	}
	public int getI2() {
		return i2;
	}
	public void setI2(int i2) {
		this.i2 = i2;
	}
	public float getF1() {
		return f1;
	}
	public void setF1(float f1) {
		this.f1 = f1;
	}
	public float getF2() {
		return f2;
	}
	public void setF2(float f2) {
		this.f2 = f2;
	}
	public double getD1() {
		return d1;
	}
	public void setD1(double d1) {
		this.d1 = d1;
	}
	public double getD2() {
		return d2;
	}
	public void setD2(double d2) {
		this.d2 = d2;
	}
	/*public int sumarenteros() {
		suma = i1+i2;
		return (int)suma;
	}
	public float sumarenteros() {
		suma = f1+f2;
		return (float)suma;
	}
	public double sumarenteros() {
		suma = d1+d2;
		return (double)suma;
	} 
		*/ 
	 }
	
	
	
	
	
	
	
	


/*Implemente la clase Complejo (números complejos). Defina constructores y el
método de multiplicación de complejos. Además programe tres funciones suma(),
una que reciba dos números de tipo int, otra que reciba dos números de tipo float,
y otra que reciba dos números complejos.*/
