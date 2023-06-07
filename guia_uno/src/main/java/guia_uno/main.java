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
	         ps.println("4. Ejercicios con Collections");
	         ps.println("5. Prototipo de Prueba");
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
	            	EjerciciosMenuTres();
	            	break;
	            case 4:
	            	EjerciciosMenuCuatro();
		             break;
	            case 5:
	            	PrototipoPrueba.menu();
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
	         ps.println("5. Signo Zodiacal");
	         ps.println("6. Apellido Mas Largo");
	         ps.println("7. Tabla de Multiplicar");
	         ps.println("8. Es Primo");
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
		            System.out.println("Ha seleccionado Signo Zodiacal");
		            EjerciciosDos.signoZodiacal();
		            break;
	            case 6:
		            System.out.println("Ha seleccionado Apellido mas Largo");
		            EjerciciosDos.apellidoMasLargo();
		            break;
	            case 7:
		            System.out.println("Ha seleccionado Tabla de Multiplicar");
		            EjerciciosDos.tablaDeMultiplicar();
		            break;
	            case 8:
		            System.out.println("Ha seleccionado Comprobador de N Primos");
		            EjerciciosDos.numeroPrimo();;
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
	
	public static void EjerciciosMenuCuatro() {
		while (true) {
	         ps.println("Menú ejercicios con Collections:");
	         ps.println("1. Lista de Numeros, suma y promedio: ");
	         ps.println("2. Lista de alumnos de ET32");
	         ps.println("3. ");
	         ps.println("4. ");
	         ps.println("5. ");
	         ps.println("6. ");
	         ps.println("7. ");
	         ps.println("8. ");
	         ps.println("0. ");

	         
	         int opcion = reader.readerInt("------Ingrese ejercicio a ejecutar: ");

	         switch (opcion) {
	            case 1:
	               System.out.println("Ha seleccionado 1: ");
	               EjerciciosCuatro.E1();
	               break;
	            case 2:
	               System.out.println("Ha seleccionado Nacionalidad/Colegio");
	               EjerciciosCuatro.nacionalidadColegio();;
	               break;
	            case 3:
		            System.out.println("Ha seleccionado jugadores del BARCA");
		            EjerciciosCuatro.jugadoresBarca();
		            break;
	            case 4:
		            System.out.println("Ha seleccionado calcular si dos numeros son divisibles");
		            EjerciciosDos.calcularDivisibilidad();
		            break;
	            case 5:
		            System.out.println("Ha seleccionado Signo Zodiacal");
		            EjerciciosDos.signoZodiacal();
		            break;
	            case 6:
		            System.out.println("Ha seleccionado Apellido mas Largo");
		            EjerciciosDos.apellidoMasLargo();
		            break;
	            case 7:
		            System.out.println("Ha seleccionado Tabla de Multiplicar");
		            EjerciciosDos.tablaDeMultiplicar();
		            break;
	            case 8:
		            System.out.println("Ha seleccionado Comprobador de N Primos");
		            EjerciciosDos.numeroPrimo();;
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
	
	public static void EjerciciosMenuTres() {
		while (true) {
	         ps.println("Menú ejercicios con Files:");
	         ps.println("1. EJ1 Files ");
	         ps.println("2. Lista de alumnos de ET32");
	         ps.println("3. ");
	         ps.println("4. ");
	         ps.println("5. ");
	         ps.println("6. ");
	         ps.println("7. ");
	         ps.println("8. ");
	         ps.println("0. ");

	         
	         int opcion = reader.readerInt("------Ingrese ejercicio a ejecutar: ");

	         switch (opcion) {
	            case 1:
	               System.out.println("Ha seleccionado 1: ");
	               EjerciciosTres.EJ1();
	               break;
	            case 2:
	               System.out.println("Ha seleccionado Nacionalidad/Colegio");
	               EjerciciosCuatro.nacionalidadColegio();;
	               break;
	            case 3:
		            System.out.println("Ha seleccionado jugadores del BARCA");
		            EjerciciosCuatro.jugadoresBarca();
		            break;
	            case 4:
		            System.out.println("Ha seleccionado calcular si dos numeros son divisibles");
		            EjerciciosDos.calcularDivisibilidad();
		            break;
	            case 5:
		            System.out.println("Ha seleccionado Signo Zodiacal");
		            EjerciciosDos.signoZodiacal();
		            break;
	            case 6:
		            System.out.println("Ha seleccionado Apellido mas Largo");
		            EjerciciosDos.apellidoMasLargo();
		            break;
	            case 7:
		            System.out.println("Ha seleccionado Tabla de Multiplicar");
		            EjerciciosDos.tablaDeMultiplicar();
		            break;
	            case 8:
		            System.out.println("Ha seleccionado Comprobador de N Primos");
		            EjerciciosDos.numeroPrimo();;
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
