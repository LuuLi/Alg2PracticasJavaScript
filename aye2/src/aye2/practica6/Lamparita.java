package aye2.practica6;

public class Lamparita {
	
	enum EstadoLampara{ENCENDIDO, APAGADO} ;
	private EstadoLampara estado;
 // private bool estado;
	public Lamparita() {
		estado = EstadoLampara.APAGADO;
		
	}
	public void encender () {
		estado = EstadoLampara.ENCENDIDO;
	}
	public void apagar() {
		estado = EstadoLampara.APAGADO;
	}
	public Object getEstado() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
}
