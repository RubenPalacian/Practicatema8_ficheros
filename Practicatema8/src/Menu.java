import java.util.*;
public class Menu {

	private static String dniCall;
	private static Persona persona;

	public static void main(String[] args) {		
					
		ArrayList<Persona> lista = new ArrayList<Persona>();
			Scanner sc = new Scanner(System.in);
			int opcion;
			
			do {
				System.out.println("1.- Cargar datos");
				System.out.println("2.- Listar");
				System.out.println("3.- Insertar");
				System.out.println("4.- Eliminar");
				System.out.println("5.- Contar");
				System.out.println("6.- Buscar");
				System.out.println("7.- Ordenar");
				System.out.println("8.- Guardar en fichero");
				System.out.println("8.- Salir");
				System.out.print("Elija una opción: ");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1: Lista.cargar();
			break;
		case 2: Lista.listar();
			break;
		case 3: System.out.println(" Introduzca datos de la nueva persona: ");
	    

	    System.out.println("Nombre:");
	    String nombre = sc.nextLine();

	    System.out.println("Apellidos:");
	    String apellidos = sc.nextLine();

	    System.out.println("DNI:");
	    String dni = sc.nextLine();

	    System.out.println("Edad:");
	    int edad = sc.nextInt();

	    System.out.println("Calle:");
	    String calle = sc.toString();
	    
	    System.out.println("CP:");
	    int cp = sc.nextInt();	
	    
	    System.out.println("Provincia");
	    String provincia = sc.nextLine();
	    
	    
	    lista.add(new Persona(nombre,apellidos,dni,edad,calle,cp,provincia));

			break;
		case 4:
			System.out.println("Introduzca el campo que quiere eliminar. Si no lo sabe, lo puede encontrar con la comanda 'listar' ");
		int del = sc.nextInt();
		Lista.eliminar(del);
			System.out.println("Campo eliminado.");
			break;
		case 5:
			System.out.println("Numero total de personas en la tabla: " + Lista.contar());
			break;
		case 6:
			sc.nextLine();
			System.out.println("Introduzca el Dni. ");
			dniCall = sc.nextLine();
			for (int i = 0; i < lista.size(); i++) {
				persona = lista.get(i);
				System.out.println(persona);				
			}
			
			
			break;
		case 7: Lista.buscar();
			
			break;
		
		case 8:
			Lista.guardar();
			System.out.println("Has guardado el fichero correctamente.");
			break;
		case 9 :
			System.out.println ("Adiós");
			break;
		
		
		default: System.out.println ("Opción incorrecta. Tiene que elegir entre el 1 y el 8.");
		
		}
			}while (opcion !=9);
			
			System.out.println("Aplicación finalizada");         
            
                      
            sc.close();
			
		}	
	}

	

