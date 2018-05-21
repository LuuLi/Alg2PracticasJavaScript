package aye2.practica6;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;


	public Hora() {
		horas = 0;
		minutos = 0;
		segundos = 0;
	}
	public Hora(int h, int m, int s) {
		horas = h;
		minutos = m;
		segundos = s;
		corregirHora();
		
	}
	
	private void corregirHora() {
		if (segundos < 0) {
			segundos = 0;
		} else 
			if (segundos > 59) {
			segundos = segundos % 60;
			minutos += segundos / 60;
		}
	if (minutos < 0 ){
		minutos = 0;
		} else {
			if (minutos > 59) {
				minutos = minutos % 60;
				horas += minutos / 60;
			}
			if (horas < 0) {
				horas = 0;
			}
		} 
	

	}
	public String toString() {
		return "Hora" + String.format("%02d", horas) + ":" + minutos + ":" + segundos;
			}

	public void clone (Hora h) {
		segundos = h.segundos;
		minutos = h.minutos;
		horas = h.horas;
	}
public void sumar (Hora h2) {
segundos = h2.segundos;
minutos = h2.minutos;
horas =h2.horas;
corregirHora();
}

	public static Hora sumar(Hora h1, Hora h2) {
		Hora h3 = new Hora();
		h3.clone(h1);
		h3.sumar(h2);
		return h3;
	}
}
