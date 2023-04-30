package guia_uno;

import java.io.IOException;
import java.io.PrintStream;
import guia_uno.reader;

public class main {

	static PrintStream ps= new PrintStream( System.out );
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ps.print("Guia 1" + "\n");
			
		while (true) {
	         // Imprimir las opciones del menú
	         ps.println("Seleccione una opción:");
	         ps.println("1. Ejercicios con System");
	         ps.println("2. Ejercicios con Reader");
	         ps.println("3. Ejercicios con File");
	         ps.println("3. Ejercicios con Diccionarios");
	         ps.println("0. Salir");

	         // Leer la entrada del usuario
	         int opcion = reader.readerInt("Ingrese menú a ejecutar: ");

	         // Ejecutar la opción seleccionada
	         switch (opcion) {
	            case 1:
	               EjerciciosUnoMenu();
	               break;
	            case 2:
	            	EjerciciosMenuDos();
	               break;
	            case 3:
		               System.out.println("En construccion...");
		               break;
	            case 4:
		               System.out.println("Colecciones En construccion...");
		               break;
	            case 0:
	               System.out.println("Saliendo del programa...");
	               return;
	            default:
	               System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	               break;
	         }
	      }
		
		

		
	}
	
	public static void EjerciciosUnoMenu() {
		while (true) {
	         ps.println("Menú ejercicios con System:");
	         ps.println("1. Calcular Sueldo Bruto");
	         ps.println("2. Calcular Resto de un Triangulo");
	         ps.println("3. Calcular Perimetro de un Cuadrado");
	         ps.println("4. De Farenheit a Centigrados");
	         ps.println("5. Conversion de Segundos");
	         ps.println("6. Planes de pago");
	         ps.println("7. Signo Zodiacal");
	         ps.println("0. Salir");

	         
	         int opcion = reader.readerInt("------Ingrese ejercicio a ejecutar: ");

	         switch (opcion) {
	            case 1:
	               System.out.println("Ha seleccionado Calcular Sueldo Bruto: ");
	               EjerciciosUno.calcularSueldoBruto();
	               break;
	            case 2:
	               System.out.println("Ha seleccionado Resto de un Triangulo");
	               EjerciciosUno.calcularRestoTriangulo();
	               break;
	            case 3:
		            System.out.println("Ha seleccionado Perimetro de un Cuadrado");
		            EjerciciosUno.calcularPerimetroCuadrado();   
		            break;
	            case 4:
		            System.out.println("Ha seleccionado De Farenheit a Centigrados");
		            EjerciciosUno.farenheitACentigrados();
		            break;
	            case 5:
		            System.out.println("Ha seleccionado Conversion de Segundos");
		            EjerciciosUno.conversionSegundos();
		            break;
	            case 6:
		            System.out.println("Ha seleccionado Planes de pago");
		            EjerciciosUno.planesDePago();
		            break;
	            case 7:
		            System.out.println("Ha seleccionado Signo Zodiacal");
		            ps.println(EjerciciosUno.SignosZodiacales());
		            break;
	            case 0:
	               System.out.println("Saliendo del menu Ej con Sytem...");
	               return;
	            default:
	               System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	               break;
	         }
	      }
		
		
		
	}
	
	public static void EjerciciosMenuDos() {
		while (true) {
	         ps.println("Menú ejercicios con Reader:");
	         ps.println("1. Ordenar Apellidos");
	         ps.println("2. Calcular el numero menor");
	         ps.println("3. Calcular numero Par o Impar");
	         ps.println("4. Calcular divisibilidad");
	         ps.println("5. Conversion de Segundos");
	         ps.println("6. Planes de pago");
	         ps.println("7. Signo Zodiacal");
	         ps.println("0. Salir");

	         
	         int opcion = reader.readerInt("------Ingrese ejercicio a ejecutar: ");

	         switch (opcion) {
	            case 1:
	               System.out.println("Ha seleccionado Ordenar Apellidos: ");
	               EjerciciosDos.apellidosOrdenados();
	               break;
	            case 2:
	               System.out.println("Ha seleccionado Numero Menor");
	               EjerciciosDos.numeroMenor();
	               break;
	            case 3:
		            System.out.println("Ha seleccionado numero Par o Impar");
		            EjerciciosDos.calcularPar();
		            break;
	            case 4:
		            System.out.println("Ha seleccionado calcular si dos numeros son divisibles");
		            EjerciciosDos.calcularDivisibilidad();
		            break;
	            case 5:
		            System.out.println("Ha seleccionado Conversion de Segundos");
		            break;
	            case 6:
		            System.out.println("Ha seleccionado Planes de pago");
		            break;
	            case 7:
		            System.out.println("Ha seleccionado Signo Zodiacal");
		            break;
	            case 0:
	               System.out.println("Saliendo del menu Ej con Sytem...");
	               return;
	            default:
	               System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	               break;
	         }
	      }
		
		
		
	}

}
