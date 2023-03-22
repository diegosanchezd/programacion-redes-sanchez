package flujo_de_datos;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.printf("Hola %s %d %c %f", "Mundo" 10 64 5.1);
		//System.err.println("Error");
		
		//System.out.append("Append Agregado");
		//System.flush();
		
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
		
		PrintStream ps= new PrintStream( System.out );
		ps.print("Que Onda?");
	
	}

}
