package guia_uno;

import java.io.PrintStream;

public class EjercicioCinco {
		
	public static void conversionSegundos() {
		
		PrintStream ps= new PrintStream( System.out );

		ps.print("Eejercicio 5: ");
		int segundos= reader.readerInt("Ingrese los segundos a convertir: ");
		
		int dias, horas, minutos, seg;
		
		dias= segundos / 86400;
		horas= (segundos % 86400) / 3600;
		minutos= ((segundos % 86400) % 3600) / 60;
		int segRestantes= (((segundos % 86400) % 3600) / 60) % 60;
		
		ps.print("En total son: "+ dias+ " dias, "+ horas+ " horas, "+ minutos+ " minutos y "+ segRestantes+ " segundos" );
		
	}
}
