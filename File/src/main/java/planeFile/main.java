package planeFile;

import java.io.IOException;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		file arch= new file();
		
		FileBinari fb= new FileBinari(); //el programa
		String bin = "DumbMemory.bin"; //archivo
		
		try {
			//se abre un archivo de mamoria
			fb= fb.deserializar( bin );

		}catch(IOException || ClassNotFound ex) {
			
		}finally {
			//se corre el programa y empieza a trabajar
			fb.correrPrograma();
		}
		//aca ya se deberia estar ejecutando el programa
	
		
		try {
			
			fb.serializar( bin );
		
		}catch( IOException e ) {
			
			PrintStream ps = new PrintStream( System.err);
			ps.print(e.getMessage());
		}
		
	
	}

}
