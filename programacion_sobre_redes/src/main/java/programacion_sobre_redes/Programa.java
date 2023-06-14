package programacion_sobre_redes;

import java.io.PrintStream;

public class Programa {
	
	static PrintStream ps = new PrintStream( System.out );
	
	public static void iniciarPrograma() {
		
		//CAMBIO EL FORMATO DEL ARCHIVO		
		Archivo.cambiarFormato();

		ps.println("Bienvenido...");
		while(true) {
			
			ps.println("1. Ver datos en conosola / 2. Ver ves con mayor cantidad de victorias / 0. Salir");
			int el= Lectura.leerIntBufferedReader("-------Que opcion desea realizar: ");
			
			if(el == 1) {
				Archivo.mostrarEnConsola();
			}else if(el == 2) {
				Archivo.victorias();
			}else if(el == 0) {
				ps.println("ADIOS...");
				System.exit(0);
				break;
			}else {
				ps.println("Opcion Invalida...");
			}
			
		}
		
	}

}
