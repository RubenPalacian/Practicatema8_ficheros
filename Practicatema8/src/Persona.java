import java.util.ArrayList;

public class Persona extends Direccion {
	
	
	protected static String nombre;
	protected static String apellidos;
	protected static String dni;
	protected static Integer edad;
	protected static String direccion;

	
	public Persona (String nombre, String apellidos, String DNI, int edad, String call, int cp, String prov) {
		super(call, cp, prov);
		Persona.nombre = nombre;
		Persona.apellidos = apellidos;
		Persona.dni = DNI;
		Persona.edad = edad;
				
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public String getApellidos() {
		
		return apellidos;

	}
	
	public String getDni() {
		
		return dni;
		
	}
	
	public Integer getEdad() {
		
		return edad;
	}
	
	public String getDireccion() {
		
		return direccion;
	}

	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	public static ArrayList<Persona> get(String i) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString(String delim) {
		// TODO Auto-generated method stub
		return null;
	}
	}


