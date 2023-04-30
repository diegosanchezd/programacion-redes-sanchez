package guia_uno;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class EjerciciosDos {

	static PrintStream ps= new PrintStream( System.out );

//_________________EJERCICIO_1
	public static void apellidosOrdenados() {
		
		ArrayList<String> names = new ArrayList<String>();		
		for(int i = 0; i < 3; i++) {
			names.add(reader.leerBufferedReader("Ingrese nombre N°"+(i+1)+ ": "));
		}
		names.sort(null);
		ps.println("---------"+names+"---------");
	}
	
//_________________EJERCICIO_2
	public static void numeroMenor() {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();		
		for(int i = 0; i < 4; i++) {
			nums.add(reader.leerReaderInt("Ingrese numero N°"+(i+1)+ ": "));
		}
		nums.sort(null);
		ps.println("---------Numero mas pequeño es "+ nums.get(0)+"---------");
	}
	
//_________________EJERCICIO_3
	public static void calcularPar() {
		while (true) {
			ps.println("Ingrese cualquier numero o 0 para salir");
	        int opcion = reader.readerInt("Ingrese numero a calcular: ");
	        if(opcion != 0) {
	        	if(opcion % 2 == 0) {
	        		ps.println("---------"+opcion+ " Es par---------");
	        	}else {
	        		ps.println("---------"+opcion+ " Es impar---------");
	        	}
	        }else {
	        	ps.print("---------Saliendo del ejercicio...---------");
	        	break;
	        }
		}
	}
	
//_________________EJERCICIO_4
	
	public static void calcularDivisibilidad() {
		double n1= reader.leerReaderDouble("Ingrese primer numero: ");
		double n2= reader.leerReaderDouble("Ingrese segundo numero: ");
		ArrayList<Double> nums = new ArrayList<Double>();		
		nums.add(n1);
		nums.add(n2);
		nums.sort(null);
		
		if(nums.get(1) % nums.get(0) == 0) {
			ps.println("---------Son divisibles--------");
		}else {
			ps.println("---------No son divisibles---------");
		}
		
	}
	
	
//_________________EJERCICIO_5
	
	
//_________________EJERCICIO_6

	
}
