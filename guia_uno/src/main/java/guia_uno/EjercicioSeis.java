package guia_uno;

import java.io.PrintStream;

public class EjercicioSeis {
	
	public static void planesDePago() {
		
		PrintStream ps= new PrintStream( System.out );
		ps.print("Ejercicio 5: ");
		
		int eleccion= reader.readerInt("Tienes 4 planes para abonar: \n Plan 1 => Presione 1 \n Plan 2 => Presione 2 \n Plan 3 => Presione 3 \n Plan 4 => Presione 4: ");
		
		double producto= reader.readerDouble("Precio del producto a comprar:");
		double total= 0;
		double contado= 0;
		double precioPorCuota= 0;
		
		if(eleccion == 1) {
			ps.print("Plan 1: 10% de descuento  abonando 100% al contado: ");
			ps.print( "Total a pagar: "+ (total = producto - (producto * 0.10)));
		}else if(eleccion == 2) {
			ps.println("Plan 2:  50% al contado y el resto en 2 cuotas iguales, aumento del producto final de 10% ");
			
			contado= producto / 2;
			total= producto + (producto * 0.10);
			precioPorCuota= (total - contado) / 2;
			
			ps.println("Total a pagar: $"+ total+ " pagando al contado un total de $" +contado+ " y el resto en 2 cuotas de $"+ precioPorCuota);
			
		}else if(eleccion == 3) {
			ps.println("Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio incrementa un 15%. ");
			
			contado= producto * 0.25;
			total= producto + (producto * 0.15);
			precioPorCuota= (total - contado) / 5;
			
			ps.println("Total a pagar: $"+ total+ " pagando al contado un total de $" +contado+ " y el resto en 5 cuotas de $"+ precioPorCuota);
		}else if(eleccion == 4) {
			
			ps.println("Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en las primeras 4 cuotas y el resto se reparte en partes iguales en las últimas 4 cuotas. El precio publicado incrementa un 25%.");
			
			
			total= producto + (producto * 0.25);
			double primerasCuotas= (total * 0.6);
			double precioPrimerasCuotas= (total * 0.6) / 4;
			precioPorCuota= (total - primerasCuotas) / 4;

			ps.println("Total a pagar: $"+ total+ " pagando 4 cuotas iniciales de $" +precioPrimerasCuotas+ " y el resto en 4 cuotas de $"+ precioPorCuota);
		}else {
			ps.print("Opción Inválida");
		}

		
	}
}
