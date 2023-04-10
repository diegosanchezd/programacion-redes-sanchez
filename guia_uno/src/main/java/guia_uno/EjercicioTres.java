package guia_uno;

import java.io.PrintStream;

public class EjercicioTres {
	
	public static void calcularPerimetroCuadrado(){
		
		PrintStream ps = new PrintStream(System.out);
		
		ps.print("Calcular Perimetro de un cuadrado \n");
		int superficie= reader.readerInt("Ingrese la superficie: ");
		
		double raiz= Math.sqrt(superficie);
		double perimetro= raiz * 4;
		
		ps.print("El perimetro del cuadrado es: "+ perimetro);
		
	}
}
