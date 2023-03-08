package repasoPoo;

public abstract class Arma {
	protected String nombre;
	
	public Arma(String n) {
		this.nombre= n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	abstract void disparo();
	
}
