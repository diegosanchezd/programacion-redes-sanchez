package repasoPoo;
import repasoPoo.Dni;
import repasoPoo.Arma;
import repasoPoo.Antecedente;

public abstract class Persona {
	
	protected String profesion;
	protected Dni dni;
	
	public Persona(String p) {
		this.profesion= p;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
	abstract void disparar();
	
	protected Dni generarDni(int id, String n, String a) {
		return new Dni(id,n,a);
	}
	

	protected Antecedente verAntecedentes(String a) {
		return new Antecedente(a);
	}
}
