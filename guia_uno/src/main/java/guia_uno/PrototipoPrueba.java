package guia_uno;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrototipoPrueba {
	
	static PrintStream ps= new PrintStream( System.out );
	
	public static String pruebaFiles() {
		
		String texto ="";

		try {
			
			FileReader fr = new FileReader("tienda.txt");
			BufferedReader br = new BufferedReader( fr );
			
			String linea = "";
			
			while( (linea = br.readLine() ) != null) {
				texto += "\n" + linea;
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ps.print(texto);
		return texto;
		
	}
	
	
	public static String cambiarFormato() {
		
		String texto ="";
		File archivo = new File("tienda.txt");

		String separador= reader.leerBufferedReader("Con que formato va a separar los registros: ");
		
		char separadorAnterior= pruebaFiles().charAt(2); 
		
		ps.println("___________SEPARADOR_______:"+ separadorAnterior);
		String linea = "";
		
		try {
			
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader( fr );
			
			while( (linea = br.readLine() ) != null) {
				
				texto += linea.replaceAll( Character.toString(separadorAnterior) , separador) + "\n";
			}
			
			br.close();
			fr.close();
			archivo.delete();
			
			FileOutputStream fos = new FileOutputStream( archivo );
			PrintStream writer = new PrintStream( fos );
			writer.println(texto);
			
			writer.flush();
			writer.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return texto;
	}
	
	
	public static void menu() {
		
		pruebaFiles();
		
		while(true) {
			
			ps.println("1. Cambiar Formato / 2. Salir");
			int eleccion= reader.leerIntBufferedReader("Ingrese opcion a ejecutar para el archivo: ");
			
			if(eleccion == 1) {
				cambiarFormato();
			}else if(eleccion == 0) {
				break;
			}
		}
	}
	
	
}
