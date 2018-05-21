package aye2.practica6;

public class practica6 {

	public static void main(String[] args) {
		Lamparita lamp1  = new Lamparita();
		System.out.println("La lamparita esta" + lamp1.getEstado().toString());
		lamp1.encender();
		System.out.println("La lamparita esta" + lamp1.getEstado());
		
		Hora h1 = new Hora(1, 140, 160);
		Hora h2 = new Hora(1, 140, 160);
		System.out.println("La hora h1 es:" + h1);
		h1.sumar(h2);
		System.out.println("La suma de h1 y h2 es:" + Hora.sumar(h1,h2));
	
	}
	


}
