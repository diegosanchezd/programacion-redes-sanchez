package repasoPoo;

public class Dni {
	public int id;
	public String nombre;
	public String apellido;
	
	public Dni(int id, String n, String a) {
		this.id= id;
		this.nombre= n;
		this.apellido= a;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
