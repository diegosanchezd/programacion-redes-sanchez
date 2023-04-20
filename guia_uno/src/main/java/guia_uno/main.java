package guia_uno;

import java.io.IOException;
import java.io.PrintStream;
import guia_uno.reader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps= new PrintStream( System.out );
		
		
		ps.print("Guia 1" + "\n");
		ps.println("Que puntos va a probar: ");
		ps.print(" 1. System => Presione 1 \n 2. Readers => Presione 2 \n 3. No disponible... => Presione 3 \n 4. Colecciones => Presione 4 \n");
		int elecMenu = reader.readerInt("Que menú desea ver: ");
		
		if(elecMenu == 1) {
			
			ps.print("Menu de opciones de ejercicios con System: ");
			ps.println("1=> Calcular Sueldo \n 2=> Resto de un Triangulo \n 3=> Perimetro de un cuadrado \n 4=>Farenheit a Centigrados \n 5=> Conversion de segundos \n 6=> Plan de pago \n 7=> Signo Zodiacal \n 0=>Salir");
			int elecEjercicio= reader.readerInt("Ingrese opcion elegida: ");
			
			while( elecEjercicio != 0) {
			ps.println("1=> Calcular Sueldo \n 2=> Resto de un Triangulo \n 3=> Perimetro de un cuadrado \n 4=>Farenheit a Centigrados \n 5=> Conversion de segundos \n 6=> Plan de pago \n 7=> Signo Zodiacal \n 0=>Salir");
			if(elecEjercicio == 1) {
				EjercicioUno.calcularSueldoBruto();
			}else if(elecEjercicio == 2) {
				EjercicioDos.calcularRestoTriangulo();
			}else if(elecEjercicio == 3) {
				EjercicioTres.calcularPerimetroCuadrado();
			}else if(elecEjercicio == 4) {
				ejercicioCuatro.farenheitACentigrados();
			}else if(elecEjercicio == 5) {
				EjercicioCinco.conversionSegundos();
			}else if(elecEjercicio == 6) {
				EjercicioSeis.planesDePago();
			}else if(elecEjercicio == 7) {
				EjercicioSiete.SignosZodiacales();
			}else if(elecEjercicio == 0) {
				ps.print("Adios");
			}
		  }
		}
		
		
		

		
	}

}
