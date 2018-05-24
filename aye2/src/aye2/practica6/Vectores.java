package aye2.practica6;

public class Vectores {
	private float x,y,z;
	
		public Vectores() {
			x=0;
			y=0;
			z=0;
		}
		public Vectores (float x, float y, float z) {
			this.x = x;
			this.y=y;
			this.z=z;
			corregirvectores();
		}
		public void corregirvectores() {
			if (x<0) {
				x=0;
			}else {
				if (y<0) {
					y=0;
				}else {
					if (z<0) {
						z=0;
				
				}
			}
		}
		}
			
		public float getx() {
			return x;
		}
		public float gety() {
			return y;
		
	}
		public float getz() {
			return z;
		}
		
		public void setx (float x) {
			this.x =x;
		}
		public void sety (float y) {
			this.y =y;
		}
		public void setz (float z) {
			this.z =z;
		}
		public String toString() {
			return "(" + x + "," + y + "," + z + ")";
				}
		public void clone (Vectores v) {
			x = v.x;
			y = v.y;
			z = v.z;
		}
	public void sumar (Vectores h2) {
	x = h2.x;
	y = h2.y;
	z =h2.z;
	corregirvectores();
	}

		public static Vectores sumar(Vectores v1, Vectores v2) {
			Vectores v3 = new Vectores();
			v3.clone(v1);
			v3.sumar(v2);
			return v3;
		}
	
	}


	/*Implemente la clase Vector3D (ternas de coordenadas de tipo float x, y, z). Defina
constructores y métodos para asignar valores a las coordenadas de los vectores3D,
retornar el valor de cada coordenada, y sumar dos vectores3D, retornando su
resultado. Definir un método booleano de igualdad entre dos vectores3D.
Implementar esta clase a partir de la implementación de la clase Punto. */


