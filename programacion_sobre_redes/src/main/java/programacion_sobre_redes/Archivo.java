package programacion_sobre_redes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Archivo {
	
	static PrintStream ps= new PrintStream( System.out );
	
	//CAMBIO DE FORMATO
	public static String cambiarFormato() {
		
		String texto ="";
		File archivo = new File("juegos.dat");

		String linea = "";
		 
		try {
			
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader( fr );
			
			while( (linea = br.readLine() ) != null) {
				
				texto =  texto +linea.replaceAll( "\\+", ";") + '\n';
				
			}
			
			br.close();
			fr.close();
			archivo.deleteOnExit();
			
			File archivoNuevo = new File("juegos.scv");
			
			FileOutputStream fos = new FileOutputStream( archivoNuevo );
			PrintStream writer = new PrintStream( fos );
			writer.println(texto);
			
			writer.flush();
			writer.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ErrorMsg(e.toString());
		}
		
		return texto;
	}
	
	//MUESTRA DE DATOS EN CONSOLA
	public static String mostrarEnConsola() {
		
		String texto ="";
		File archivo = new File("juegos.scv");
		String linea = "";
		 
		try {
			
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader( fr );
			
			while( (linea = br.readLine() ) != null) {
				
				texto =  texto +linea.replaceAll( ";", " | ") + '\n';
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ErrorMsg(e.toString());
		}
		
		ps.println(texto);
		return texto;
	}
	
	//MES CON MAYOR VICTORIAS
	
public static String victorias() {
		
		String texto ="";
		File archivo = new File("juegos.scv");
		String linea = "";
		 
		try {
			
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader( fr );
			
			
			while( (linea = br.readLine() ) != null) {
				
				texto += linea+ '\n';
			}
			
			 HashMap<String , Integer> meses = new HashMap<String , Integer>();
			
			String[] lines = texto.split("\n");
			for(String line : lines ) {
				
				String m= Character.toString(line.charAt(4));
				String vs= Character.toString(line.charAt(6));
				 
				if(vs.equals("a")) {
					continue;
				}else {
					int v = Integer.parseInt(vs);
					if(meses.containsKey(m)) {
						int anterior= meses.get(m);
						if(vs.equals("1")) {
							int nueva = anterior+1;
							meses.put(m, nueva);
						}
					}else {
						meses.put(m, v);
					}
				}
			}
			
			for( Map.Entry<String, Integer> mes : meses.entrySet() ) {
				ps.println("MES: "+ mes.getKey() + " Victorias: " + mes.getValue());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ErrorMsg(e.toString());
		}
		
		return texto;
	}

public static void ErrorMsg(String msg) {

	File error = new File("crash.log");
	try {
		FileOutputStream fos = new FileOutputStream(error); 
		PrintStream ps = new PrintStream(fos); 

		ps.println(msg);
		ps.flush();
		ps.close();
		fos.close();

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

}
	

}
