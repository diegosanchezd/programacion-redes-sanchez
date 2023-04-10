package guia_uno;

import java.io.PrintStream;

public  class EjercicioUno {
	
	public static void calcularSueldoBruto(){
		
		PrintStream ps= new PrintStream( System.out );

			ps.print("Guia 1" + "\n");
			ps.print("Ejercicio 1: ");
		
			int sueldoBruto= 0;
			
			int horas= reader.readerInt("Ingrese cuantas horas trabajó: ");
			int valorPorHora= reader.readerInt("Ingrese cuanto gana por hora: ");
		
			int total= horas* valorPorHora;
			ps.print("El total es: "+ total);
		
	}
}
