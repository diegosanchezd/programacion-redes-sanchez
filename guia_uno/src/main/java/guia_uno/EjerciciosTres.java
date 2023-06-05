package guia_uno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class EjerciciosTres {
	
	static PrintStream ps= new PrintStream( System.out );

	
	public static void EJ1()  {
		
		File file = new File("archivo.txt");
		FileOutputStream fos;
		
		try {
			
			fos = new FileOutputStream(file);
			PrintStream writer = new PrintStream( fos );
			String text= reader.leerBufferedReader("Ingrese texto: ");
			
			writer.println(text);
			writer.flush();
			writer.close();
			fos.close();	
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		
	}
}
