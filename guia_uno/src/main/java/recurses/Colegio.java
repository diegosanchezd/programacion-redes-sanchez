package recurses;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
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
		if(alumnos.size() >= 1) {
			for( Map.Entry<String, String> item : alumnos.entrySet() ) {
				ps.println("Alumno N°"+contador+": "+ item.getKey() +", Nacionalidad:  "+ item.getValue());
				contador++;
			}
		}else {
			ps.println("------Lista de alumnos vacia...--------");
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
		
		ps.println("--------------"+counter +" Alumnos con esa nacionalidad---------");
	}
	
	public void howMany() {
		
		HashSet<String> nacionalidad = new HashSet<String>();
		for( Map.Entry<String, String> item : alumnos.entrySet() ) {
			nacionalidad.add(item.getValue());
		}
		ps.println("Las variedad de nacionalidades es: "+nacionalidad);
	}
	
	public void removeAll() {
		for(Map.Entry<String, String> item: alumnos.entrySet()) {
			String key = item.getKey();
			alumnos.remove(key);
		}
	}

	
	
	
}
