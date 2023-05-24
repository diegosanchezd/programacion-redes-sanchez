package guia_uno;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import recurses.Colegio;

public class EjerciciosCuatro {
	
	static PrintStream ps= new PrintStream( System.out );
	 

	//______E1
	public static void E1() {
		ps.println("Ejercicio 1");
		
		LinkedList<Integer> lista = new LinkedList();
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
	
	//_____CALCULAR_SUMA
	public static double calcularSuma(List lista) {
		
		List<Integer> newList = lista;
		int valorSuma = 0;
		for(int num : newList) {
			valorSuma += num;
		}
				
		return valorSuma;
	}
	
	//_____MOSTRAR_RESULTADOS
	public static void mostrarResultados(LinkedList<Integer> lista) {
		
		leerValores(lista);
		double promedio = calcularSuma(lista) / lista.size();
		ps.println("----------Suma de todo: "+ calcularSuma(lista) + "----------");
		ps.println("----------PROMEDIO: "+ promedio+"----------");
		
		for(Integer numero : lista) {
			if(numero > promedio) {
				ps.println(numero +" es mayor al promedio");
			}
				
		}
		
		
	}
	
	public static void nacionalidadColegio() {
		Colegio et32 = new Colegio();
		
		ps.println("Lista de Alumnos:");
		boolean bucle = true;
		while(bucle) {
			String apellido= reader.leerReader("Apellido del alumno: ");
			String nacionalidad= reader.leerReader("Nacionalidad del alumno: ");

			et32.addAlumno(apellido, nacionalidad);
			
			String otroAlumno= reader.leerReader("Desea agregar otro alumno?: ");
			if(otroAlumno.toUpperCase().equals("NO")) {
				bucle = false;
				break;
			}
		}
		
		et32.showAll();
		et32.showNacionalidad("Argentino");
	}
	
	
	
	
}
