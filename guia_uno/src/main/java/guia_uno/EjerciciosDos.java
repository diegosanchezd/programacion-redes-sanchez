package guia_uno;

import java.io.PrintStream;
import java.time.LocalDate;
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
	
	public static void signoZodiacal() {
		
		String fechaNacimiento= reader.leerReader("Ingrese la fecha de nacimiento (en formato dd/mm/aaaa): ");
        LocalDate fecha = LocalDate.parse(fechaNacimiento, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        int mes = fecha.getMonthValue();
        int dia = fecha.getDayOfMonth();
        
        String signo = "";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 21)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            signo = "Capricornio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        }

        ps.println("--------------Tu signo del zodíaco es: " + signo +"--------------");
		
	}
	
	
//_________________EJERCICIO_6
	
	public static void apellidoMasLargo() {
		String nombreCompletoUno= reader.leerReader("Ingrese Nombre y Apellido: ");
		String nombreCompletoDos= reader.leerReader("Ingrese segundo Nombre y Apellido: ");
		
		String apellidoUno= nombreCompletoUno.split(" ")[1];
		String apellidoDos= nombreCompletoDos.split(" ")[1];

		
		if(apellidoUno.length() < apellidoDos.length()) {
			ps.println("--------------El apellido de "+nombreCompletoDos.split(" ")[0] +" es mas largo--------------");
		}else if(apellidoDos.length() < apellidoUno.length()) {
			ps.println("--------------El apellido de "+nombreCompletoUno.split(" ")[0]+" es mas largo--------------");
		}else {
			ps.println("--------------Ambos son igual de largos--------------");
		}
		
	}

//_________________EJERCICIO_7
	
	public static void tablaDeMultiplicar() {
		int num= reader.readerInt("Ingresa un numero para ver su tabla de multiplicar: ");
		
		for(int i= 1; i <= 10; i++) {
			ps.println(num +" x "+ i+ " = "+ (num * i));
		}
	}

//_________________EJERCICIO_8
	
	public static void numeroPrimo() {
		int num= reader.leerIntBufferedReader("Ingrese numero para saber si es primo o no: ");
		boolean esPrimo= true;
		 if (num <= 1) {
			 esPrimo=  false;
	        }
	     for (int i = 2; i <= Math.sqrt(num); i++) {
	         if (num % i == 0) {
	        	 esPrimo=  false;
	            }
	      }
	     
	    if(esPrimo) {
	    	ps.print("---------"+ num+" Es Primo---------");
	    }else {
	    	ps.print("---------"+ num+" No es Primo---------");
	    } 
	}
	
	
	


	
}













