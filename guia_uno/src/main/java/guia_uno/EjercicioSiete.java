package guia_uno;

import java.io.PrintStream;

public class EjercicioSiete {
	
	public static void SignosZodiacales() {

		PrintStream ps = new PrintStream(System.out);
		ps.print("Ejercicio Siete: ");
		
		String signo= reader.reading("Ingresa tu signo: ");
		
		String[] signos = {"ARIES","TAURO","GEMINIS","CANCER","LEO","VIRGO","LIBRA","ESCORPIO","SAGITARIO","CAPRICORNIO","ACUARIO","PISCIS"};
		String[] meses = {"Marzo o Abril","Abril o Mayo","Mayo o Junio","Junio o Julio","Julio o Agosto", "Agosto o Septiembre", "Septiembre u Octubre","Octubre o Noviembre","Noviembre o Diciembre","Diciembe o Enero", "Enero o Febrero","Frebrero o Marzo"};
		
		for(int i = 0; i < signos.length ; i++) {
			if(signo.toUpperCase().equals(signos[i])) {
				ps.print("Posiblemente naciste en "+ meses[i]);
			}else {
				ps.print("Signo no encontrado, verifique que esté bien escrito e intente nuevamente...");
			}
		}
		
		
	}
}
