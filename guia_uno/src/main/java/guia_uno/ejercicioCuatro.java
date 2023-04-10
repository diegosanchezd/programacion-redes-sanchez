package guia_uno;

import java.io.PrintStream;

public class ejercicioCuatro {

	public static void farenheitACentigrados(){
		PrintStream ps= new PrintStream(System.out);
		
		ps.print("De Farenheit a Grados Centigrados \n");
		
		int temp= reader.readerInt("Ingrese los grados en farenheit: ");
		
		double centigrados= (temp - 32) * 5 / 9;
		ps.print(centigrados);
	}
}
