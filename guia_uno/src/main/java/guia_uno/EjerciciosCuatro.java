package guia_uno;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
		et32.showNacionalidad("argentina");
		et32.howMany();
		
		String ifDelete = reader.leerReader("Desea borrar todos los alumnos? S/N: ");
		if(ifDelete.toUpperCase().equals("S")) {
			et32.removeAll();
			et32.showAll();
		}
		
	}
	
	public static void jugadoresBarca() {
		HashSet<String> jugadores = new HashSet<String>();
		jugadores.add("Jordi Alba");
		jugadores.add("Pique");
		jugadores.add("Busquets");
		jugadores.add("Iniesta");
		jugadores.add("Messi");
		for( String jugador : jugadores ) {
			ps.println("------Jugador: "+jugador+"-------");
		}
		
		while(true) {
			HashSet<String> jugadores2 = new HashSet<String>();
			jugadores2.add("Pique");
			jugadores2.add("Busquets");
			
			ps.println("0-Para salir");
			ps.println("1-Saber si esta Neymar jr");
			ps.println("2-Saber si los jugadores de la segunda lista estan en la primera");
			int elec= reader.leerReaderInt("--Ingrese opcion: ");
			
			boolean isNeymar= false;
			if(elec == 1) {
				for( String jugador : jugadores ) {
					if(jugador.equals("Neymar Jr")) {
						isNeymar = true;
						break;
					}
				}if(isNeymar) {
					ps.println("Esta Neymar");
				}else ps.println("-----------NO esta Neymar---------");
			}else if(elec == 2) {
				 Iterator<String> iterator = jugadores2.iterator();
			        while (iterator.hasNext()) {
			            String elemento = iterator.next();
			            // Realizar operaciones con el elemento actual
			            Iterator<String> iterator2 = jugadores.iterator();
				        while (iterator.hasNext()) {
				            String elemento2 = iterator.next();
				            if(elemento == elemento2) {
				            	ps.println("----------"+elemento+ " Esta en la lista jugadores-------");
				            }
				        }
			        }
			}else if(elec == 0) {
				return;
			}
		}
		
		
	}
	
	
	
	
}
