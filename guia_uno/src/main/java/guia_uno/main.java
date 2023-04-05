package guia_uno;

import java.io.IOException;
import java.io.PrintStream;
import guia_uno.reader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps= new PrintStream( System.out );
		
		ps.print("Guia 1" + "\n");
		ps.print("Ejercicio 1: ");
		
		int sueldoBruto= 0;
		String pagoPorHora = "", horasFinales= "";
		
		
		
		reader red = null;
		
		int hora= red.readerInt("10");
		int plata= red.readerInt("100");
		int sueldoTotal= plata * hora;
		
		ps.print(sueldoTotal);
		
		
		/*try {
			
			int horas = 0;
			ps.print("Ingrese la cantidad de horas que trabaja:");
			while((horas= System.in.read()) !=  '\n'){
				if( horas != '\r' )
					horasFinales+= (char)horas;
			}
			
			
			int aux= 0;
			ps.print("Ingrese cuento cobra por hora:");
			while((aux= System.in.read()) !=  '\n'){
				if( aux != '\r' )
					pagoPorHora+=(char)aux;
			}
			
			
			sueldoBruto= Integer.parseInt(horasFinales) * Integer.parseInt(pagoPorHora);
			
			ps.print("Sueldo total: "+ sueldoBruto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			
		

		
	}

}
