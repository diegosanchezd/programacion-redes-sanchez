package flujo_de_datos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.printf("Hola %s %d %c %f", "Mundo" 10 64 5.1);
		//System.err.println("Error");
		
		//System.out.append("Append Agregado");
		//System.flush();
		
		/*
		System.out.write(64);
		System.out.write(32);
		System.out.write(64);
		System.out.write(13);
		System.out.write(10);
		
		byte[] array= {72,111,108,97,32,109,117,110,100,111};
		
		try {
			System.out.write( array );
			System.out.println();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Logger.getLogger(main.class.getName()).log(Level.SEVERE, "Que hiciste Boludo?");
		
		ps.print("Que Onda?");
		*/
		
		//PrintStream es el canal de comunicaciones para no usar directamente System.
		//____________CLASE__READER
		
		//Input: entrada
		//Stream: canal de comunicación
		//Reader: lector

		PrintStream ps= new PrintStream( System.out );

		
		Reader obj= new InputStreamReader( System.in );
		InputStreamReader obj2= new InputStreamReader(System.in);
		
		try {
			ps.print( obj.read() );
			//ps.print( (char)obj.read() );

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//obj2.getEncoding();
		
		//MAP Y HASHMAP
		Map< String, String > inglesEspañol= new HashMap<String, String>();
		
		inglesEspañol.put("Hello", "Hola");
		inglesEspañol.put("Bye", "Chau");
		
		inglesEspañol.containsValue("Hola");
		inglesEspañol.replace("Hello", "Holis");
		
	}

}
