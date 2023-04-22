package guia_uno;

import java.io.PrintStream;

public  class EjerciciosUno {
	
	static PrintStream ps= new PrintStream( System.out );
	
	//____________EJERCICIO_1
	public static void calcularSueldoBruto(){
			ps.println("Ejercicio 1: ");
		
			int sueldoBruto= 0;
			
			int horas= reader.readerInt("Ingrese cuantas horas trabajó: ");
			double valorPorHora= reader.readerDouble("Ingrese cuanto gana por hora: ");
		
			double total= horas* valorPorHora;
			ps.println("El total es: "+ total);
		
	}
	
	//____________EJERCICIO_2
	public static void calcularRestoTriangulo(){
		ps.println("Ejercicio 2: ");
		
		int anguloUno= reader.readerInt("Ingrese el valor del primer ángulo: ");
		int anguloDos= reader.readerInt("Ingrese el valor del segundo ángulo: ");
		int anguloRestante= 0;
		
		if(anguloUno + anguloDos >= 180) {
			ps.print("Datos inválidos");
		}else {
			anguloRestante= 180 - (anguloDos + anguloUno);
			ps.println("El angulo restante es de: "+ anguloRestante+ "°");
		}		
	}
	
	//____________EJERCICIO_3
	public static void calcularPerimetroCuadrado(){
		ps.println("Ejercicio 3: ");
		double superficie= reader.readerDouble("Ingrese la superficie: ");
		
		double raiz= Math.sqrt(superficie);
		double perimetro= raiz * 4;
		
		ps.println("El perimetro del cuadrado es: "+ perimetro);
		
	}
	
	//____________EJERCICIO_4
	public static void farenheitACentigrados(){		
		ps.println("Ejercicio 4: ");
		
		int temp= reader.readerInt("Ingrese los grados en farenheit: ");
		
		double centigrados= (temp - 32) * 5 / 9;
		ps.println(centigrados);
	}
	
	
	//____________EJERCICIO_5
	public static void conversionSegundos() {
		ps.println("Ejercicio 5: ");
		int segundos= reader.readerInt("Ingrese los segundos a convertir: ");
		
		int dias, horas, minutos, seg;
		
		dias= segundos / 86400;
		horas= (segundos % 86400) / 3600;
		minutos= ((segundos % 86400) % 3600) / 60;
		int segRestantes= (((segundos % 86400) % 3600) / 60) % 60;
		
		ps.println("En total son: "+ dias+ " dias, "+ horas+ " horas, "+ minutos+ " minutos y "+ segRestantes+ " segundos" );
		
	}
	
	//____________EJERCICIO_6
	public static void planesDePago() {
		ps.println("Ejercicio 6: ");
		
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
			ps.println("Opción Inválida");
		}	
	}

	//____________EJERCICIO_7
	public static String SignosZodiacales() {
		ps.println("Ejercicio 7: ");
		
		String signo= reader.reading("Ingresa tu signo: ");
		
		String[] signos = {"ARIES","TAURO","GEMINIS","CANCER","LEO","VIRGO","LIBRA","ESCORPIO","SAGITARIO","CAPRICORNIO","ACUARIO","PISCIS"};
		String[] meses = {"Marzo o Abril","Abril o Mayo","Mayo o Junio","Junio o Julio","Julio o Agosto", "Agosto o Septiembre", "Septiembre u Octubre","Octubre o Noviembre","Noviembre o Diciembre","Diciembe o Enero", "Enero o Febrero","Frebrero o Marzo"};
		
		for(int i = 0; i < signos.length ; i++) {
			if(signo.toUpperCase().equals(signos[i])) {
				return "Posiblemente naciste en "+ meses[i];
			}
			
		}
		
		return "Signo no encontrado";
	
	
	}
}
