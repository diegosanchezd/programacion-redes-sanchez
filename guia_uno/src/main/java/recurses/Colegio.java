package recurses;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Colegio {

	static PrintStream ps = new PrintStream( System.out );
	
	public HashMap<String , String> alumnos;
	
	public Colegio() {
		this.alumnos = new HashMap();
	}
	
	public void addAlumno(String apellido, String nacionalidad) {
		alumnos.put(apellido, nacionalidad);
	}
	
	public void showAll() {
		int contador = 1;
		for( Map.Entry<String, String> item : alumnos.entrySet() ) {
			ps.println("Alumno N°"+contador+": "+ item.getKey() +", Nacionalidad:  "+ item.getValue());
			contador++;
		}
	}
	
	public void showNacionalidad(String nacionalidad) {
		int counter = 0;
		ps.println("Alumnos "+ nacionalidad+ ": ");
		for(Map.Entry<String, String> item: alumnos.entrySet()) {
			if(item.getValue().equals(nacionalidad)){
				ps.println("-----"+item.getKey());
				counter++;
			}
		}
		
		ps.print("--------------"+counter +"Alumnos con esa nacionalidad---------");
	}

	
	
	
}
