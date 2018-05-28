package aye2.practica7;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public abstract class Persona {
	protected String nombre; //inicializa en null
	protected int dni; //inicializa en 0
	protected Date fechaNacimiento; 
	protected Persona pareja; 
	protected Optional<Persona> pareja2; //maybe (Persona)
	
	public Persona() {
		nombre = ""; // = nombre = new String("");
		fechaNacimiento = new Date();
		pareja2 = Optional.empty(); //null
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean tienePareja() {
		return pareja2.isPresent(); // isJust()
	}
	public boolean getPareja(Persona p) {
		if (tienePareja()) {
			//p.clone(pareja); // copia
			p = pareja2.get(); // cambia al origen
			return true;
		}else {
			return false;
		}
	}
	/*public Persona clone(Persona p) {
		Persona p2 = new Persona();
		p.dni = dni;
		p.nombre = nombre;
		return p2;
	}
	/*public Persona getPareja() {
		return pareja; } es peligroso porq puede devolver null*/
	public void leer() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese nombre de la persona: ");
		nombre = s.nextLine();
	}
	public void mostrar() {
		System.out.println(nombre);
	}
	public abstract int getIngresos();
	
	}


	