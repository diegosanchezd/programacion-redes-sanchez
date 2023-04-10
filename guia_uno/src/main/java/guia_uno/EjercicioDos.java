package guia_uno;

import java.io.PrintStream;

public class EjercicioDos {
	

	public static void calcularRestoTriangulo(){
		PrintStream ps= new PrintStream( System.out);

		ps.print("Calcular angulo restante de triangulo \n");
		
		int anguloUno= reader.readerInt("Ingrese el valor del primer ángulo: ");
		int anguloDos= reader.readerInt("Ingrese el valor del segundo ángulo: ");
		int anguloRestante= 0;
		
		if(anguloUno + anguloDos >= 180) {
			ps.print("Datos inválidos");
		}else {
			anguloRestante= 180 - (anguloDos + anguloUno);
			ps.print("El angulo restante es de: "+ anguloRestante+ "°");
		}		
	}
}
