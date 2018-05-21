package aye2.practica6;

public class practica6 {

	public static void main(String[] args) {
		Lamparita lamp1  = new Lamparita();
		System.out.printIn("La lamparita esta" + lamp1.getEstado().tsString());
		lamp1.encender();
		System.out.printIn("La lamparita esta" + lamp1.getEstado());
	}

}
