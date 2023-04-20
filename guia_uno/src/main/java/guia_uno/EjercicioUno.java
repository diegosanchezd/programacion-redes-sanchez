package guia_uno;

import java.io.PrintStream;

public  class EjercicioUno {
	
	public static void calcularSueldoBruto(){
		
		PrintStream ps= new PrintStream( System.out );

			
			ps.print("Ejercicio 1: ");
		
			int sueldoBruto= 0;
			
			int horas= reader.readerInt("Ingrese cuantas horas trabajó: ");
			double valorPorHora= reader.readerDouble("Ingrese cuanto gana por hora: ");
		
			double total= horas* valorPorHora;
			ps.print("El total es: "+ total);
		
	}
}
