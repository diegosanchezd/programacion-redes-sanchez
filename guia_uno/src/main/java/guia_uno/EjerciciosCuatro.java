package guia_uno;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjerciciosCuatro {
	
	static PrintStream ps= new PrintStream( System.out );
	 
	public static void E1() {
		ps.println("Ejercicio 1");
		
		List<Integer> lista = new LinkedList();
		while(true) {
			int num= reader.leerReaderInt("Ingrese un numero o -99 para salir: ");
			if(num == -99) {
				break;
			}
			lista.add(num);
		}
		
		mostrarResultados(lista);
		
	}
	
	//_____LEER NUMEROS
	
	public static void leerValores(List lista) {
		ps.println(lista);
	}
	
	
	
	public static double calcularSuma(List lista) {
		
		List<Integer> newList = lista;
		int valorSuma = 0;
		for(int num : newList) {
			valorSuma += num;
		}
				
		return valorSuma;
	}
	
	public static void mostrarResultados(List lista) {
		
		leerValores(lista);
		double promedio = calcularSuma(lista) / lista.size();
		ps.println("----------Suma de todo: "+ calcularSuma(lista) + "----------");
		ps.println("----------PROMEDIO: "+ promedio+"----------");
		
		List<Integer> newList = lista;
		List<Integer> mayoresPromedio = lista;

		

		/*for(int num : newList) {
			if(num > promedio) {
				mayoresPromedio.add(num);
			}
		}
		
		ps.println("--------Los numeros mayores que el promedio son: ");
		leerValores(mayoresPromedio);*/
	}
	
	
	
	
}
