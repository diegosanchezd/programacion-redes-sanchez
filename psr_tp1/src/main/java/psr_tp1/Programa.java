package psr_tp1;

import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Programa {
	
	static PrintStream ps = new PrintStream( System.out );
	//static File archivo = new File("datos.txt");
	static int[] vector = new int[5];

	public static void iniciarPrograma() {
		
	
		ps.println("Bienvenido...");
		while(true) {
			
			ps.println("1. Ver resultados / 2. Ingresar Datos en el Vector / 3. Ingresar Datos en el File  / 0. Salir");
			int el= Readers.leerIntBufferedReader("-------Que opcion desea realizar: ");
			if(el == 1) {
				verResultados();
			}else if(el == 2) {
				ps.println("Ingresar Datos en el Vector...");
				ingresarDatosVector();
			}else if(el == 3) {
				ps.println("Ingresar Datos en el File...");
				ingresarDatosFile();
			}else if(el == 0) {
				ps.println("ADIOS...");
				System.exit(0);
				break;
			}else {
				ps.println("Opcion Invalida...");
			}
			
		}	
	}
	
	public static void ingresarDatosFile() {
		
		File noVolatil = new File("noVolatil.txt");
		FileOutputStream fos;
		String textoNoVolatil="";
		
		for(int i = 0; i <= 4; i++) {
			textoNoVolatil = (textoNoVolatil+ Readers.leerIntBufferedReader("Ingrese numero para guardar en el File: ")+ "\n");
    	}
		
		try {
			
			fos = new FileOutputStream(noVolatil);
			PrintStream writer = new PrintStream( fos );
	
			writer.println(textoNoVolatil);
			writer.flush();
			writer.close();
			fos.close();	
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
	
	//_____Ingresar Datos______
	public static void ingresarDatosVector() {
		
		for(int i = 0; i<=4; i++) {
			vector[i] = Readers.readerInt("Ingrese Numeros para el vector: ");
		}
	}
	

//____________________________________	
	public static void verResultados(){
		
		String texto= "";
		String textoError= "";
		
		for(int i = 0; i <= 4; i++) {
			
			if(vector[i] == 0) {
				textoError= textoError + "En el Vector, numero en la posicion "+ i + ", osea "+ vector[i]+ ", no se puede dividir, error del tipo ArithmeticException \n"; 
				continue;
			}
			
			texto = texto + vector[i] + " / " + " 3 = " + Integer.toString(vector[i] / 3) + "\n";
		}
		
		File noVolatil = new File("noVolatil.txt");
		String linea = "";
		 
		try {
			
			FileReader fr = new FileReader(noVolatil);
			BufferedReader br = new BufferedReader( fr );
			
			while( (linea = br.readLine() ) != null) {
				//ps.print("Numero del FILE: "+ linea);
				if(linea.equals("")) {
					continue;
				}else {
					int numero = Integer.parseInt(linea);
					if(linea.equals("0")) {
						textoError= textoError + "En el file, numero "+ linea + " no se puede dividir, error del tipo ArithmeticException \n"; 
						continue;
					}else if(linea.equals("")) {
						
						}
				
				texto = texto + numero + " / " + " 3 = " + Integer.toString(numero / 3) + "\n";
			}
				}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		ps.println("RESULTADOS : "+ texto);
		ps.println("ERRORES : "+ textoError);
	
		File resultados = new File("resultados.txt");
		File errores = new File("errores.txt"); 
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream(resultados);
			PrintStream writer = new PrintStream( fos );
			
			writer.println(texto);
			writer.flush();
			writer.close();
			fos.close();	
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		try {
			fos = new FileOutputStream(errores);
			PrintStream writer = new PrintStream( fos );

			writer.println(textoError);
			writer.flush();
			writer.close();
			fos.close();	
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
			
	}
	
}
	
	
	

