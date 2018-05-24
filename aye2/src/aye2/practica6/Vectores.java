package aye2.practica6;

public class Vectores extends Punto { //Subclase de punto; toma los x y la y
	private float z;
	
		public Vectores() {
			z=0;
		}
		public Vectores (float x, float y, float z) {
			super(x,y);
			this.z=z;
		}
		
		public float getZ() {
			return z;
		}
		public void setZ(float z) {
			this.z = z;
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
	z = h2.z;
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


