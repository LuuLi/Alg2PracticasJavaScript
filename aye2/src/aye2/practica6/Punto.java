package aye2.practica6;

public class Punto {
		protected float x;
		protected float y;
			
		
		public 	Punto() {
			x = 0;
			y = 0;
		}
		public Punto(float primera, float segunda) {
			 x = primera;
			 y = segunda;
		}
		public float getx() {
			return x;
		}
		public void setx(float x) {
			this.x = x;
		}
		
		public void sety(float y) {
			this.y = y;
		}
		public float gety() {
			return y;
		}
	public void coordenadas() {
		System.out.println("Las coordenadas son: (" + x + "," + y + ")");
	}
	}

/* Implemente la clase Punto (pares de coordenadas de tipo float x, y). Defina
constructores y métodos para asignar valores a las coordenadas de los puntos,
retornar el valor de cada coordenada, y sumar dos puntos, retornando su resultado.
Definir un método booleano de igualdad entre dos puntos.*/
