package aye2.practica7;
import java.util.ArrayList;

public class SistemaEscuela {
	private final static int LONGITUD_ARREGLO = 5; //final -> una vez inicializada no se puede modificar (black final)
	// variable statica no se puede inicializar en el constructor ya q se podria llamar a la variable sin llamar al constructor
	public static void main(String[] args) {
		//arreglo estatico de personas
		Persona[] aPersona = new Persona[LONGITUD_ARREGLO];
		aPersona[0] = new Empleado();
		aPersona[1] = new Alumno();
		
		for (int i = 0; i< aPersona.length; i++) {
			System.out.println(i + ": " + aPersona[i]);
		}
		 
		//arreglo dinamico
		ArrayList<Persona> aPersona2 = new ArrayList<>();
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		aPersona2.add(new Alumno());
		
		for(int i=0; i<aPersona2.size();i++) {
			System.out.println(i + ": " + aPersona2.get(i));
		}
		for (Persona p : aPersona2) {
			System.out.println(p);
		}
		
		//Covarianza de tipo parametrico -> no
	
		ArrayList<Empleado> emp1 = new ArrayList<>();
		ArrayList<Persona> per1; //emp1 no es hijo d per1; no son covariantes; no son del mismo tipo
		// per1 = emp1; no se puede hacer; no son del mismo tipo
		
		//ArrayList<? extends Persona> per1; para q se pueda hacer per1 = emp1;
		//per1 = emp1; // se puede decir q ArrayList <Empleado> es subtipo de ArrayList <? estends Persona>
		
		 
		}

}
