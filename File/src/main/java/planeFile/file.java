package planeFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;

public class file {
	File error;
	FileWriter fw; //trabaja como canal de comunicacion (STREAM) y administra archivos escribibles

	
	
	public file() {
		error = new File("errores.log");
		
		try {
			fw= new FileWriter(error, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//this.conPrinter();
		this.conBuffered();
	}
	
	
	public void conPrintStream() {

		try {
			
			FileOutputStream fos = new FileOutputStream( error );
			//fos.write(null); //<--- Equivalente a la clase System
			
			PrintStream ps= new PrintStream( fos, true ); //en vez de System.out le pasamos el canal de comunicacion
					// el segundo parametro si es FALSE sobreescribe lo que haya dentro del archivo y va a guardar el ultimo cambio
					// si es TRUE va a guardar todo y cada cambio va a insertarse despues del anterior
			ps.print("Primera linea creada en un File");
			ps.flush();
			ps.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void conPrinter() {
		
		PrintWriter pw = new PrintWriter( fw );
		pw.print("Primera Linea con Printer");
		
		
		try {
			fw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void conBuffered() {
		
		BufferedWriter bw = new BufferedWriter( fw );
		try {
			bw.write("Linea escrita desde un Buffered");
			bw.newLine();//Para hacer salto de linea
			
			bw.flush();
			bw.close();
			fw.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {//FINALLY PARA QUE A PESAR DE ERRORES CIERRE EL BUFFERED Y EL FILEWRITER
			try {	//PARA ESO TENGO QUE HACERLO DENTRO DE OTRO TryCatch
				if( bw != null) { //_________VALIDAR QUE EL FILE ESTE ABIERTO
					bw.close();
				}if( fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void leerConBuffered() {
		
		String texto= "";
		FileReader fr;
		try {
			
			fr = new FileReader( error );
			BufferedReader br= new BufferedReader( fr );
			
			String linea= "";
			
			try {
				while( (linea= br.readLine()) != null ) {
					texto += "\n"+ linea;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

