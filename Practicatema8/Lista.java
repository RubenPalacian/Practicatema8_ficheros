import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.sun.corba.se.spi.orbutil.fsm.Input;

import LibreriasExternas.Persona;
import javafx.scene.effect.ImageInput;

public class Lista extends Persona {
	 
	
	
	static ArrayList<Persona> lista=new ArrayList<Persona>();
	
	 

	 public Lista(ArrayList<Persona> list, String nombre, String apellidos, String DNI, int edad, String call, int cp, String prov) {
		 super( nombre, apellidos, DNI, edad,  call, cp, prov);
		 lista=list;
		 
	 }
	 public static void cargar() {
		 
		 lista.add(new Persona(" Adrian ", " Garcia Santos ", " 11111111A ", 23, " C/ Los Olivos 3 ", 38493,
					" Santa Cruz de Tenerife "));	
		 	
		 lista.add(new Persona(" Ana ", "Mendez Nuñez", " 22222222B ", 22, " C/ Los Pinos 25 ", 38403,
					" Santa Cruz de Tenerife "));			
		 lista.add(new Persona(" Maria ", "Sanchez Camacho", " 33333333C ", 45, " C/ Los Franceses 23 ", 38505,
					"Las Palmas"));			
		 lista.add(new Persona(" Julio ", " Brito Gonzalez ", " 44444444D ", 30, " C/ Los Pinos 25 ", 38403, " Las Palmas "));			
			
			System.out.println("Los datos han sido cargados");
			
		}
	 
	 
	 public static void listar() {		 
		 
		 for (Persona pedido: lista) {
			 System.out.println(pedido+"\n");
	}
		 
	 }
	public static void add(Persona persona) {
		lista.add(new Persona(nombre,apellidos,dni,edad,calle,cp,edad, provincia));
		
	}
	public static void eliminar(int n) {
		lista.remove(n - 1);

	}
	public static int contar() {
		return lista.size();
	}
	
	public static ArrayList<Persona> buscaPerfil(String dni , String cognome) {
	    ArrayList<Persona> resultado = null;
	    for (Persona p : lista) {
	        if (p.isVisible() 
	            && p.getDni().equals(cognome)
	            && p.getApellidos().equals(cognome)) {
	            resultado = lista;
	            break;
	        }
	    }
	    return resultado;
			
	}
		
	
	public void ordenar() {
		
	}
	
	public static void guardar() {
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("lista.csv"));
			CSVWriter csvWriter = new CSVWriter(bw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);

			for (Persona wr : lista) {
				String delim = ",";
				String save = wr.toString(delim);

				String[] entries = save.split(delim);

				csvWriter.writeNext(entries);
			}
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
		
	public static void buscar() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Introduzca el nombre. ");
		for (int i = 0; i < lista.size(); i++) {
			Persona nombre = lista.get(i);
			System.out.println(nombre);
		}
		
		
	}
	
	 
}

