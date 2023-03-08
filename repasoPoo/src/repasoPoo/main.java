package repasoPoo;
import repasoPoo.Persona;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mafioso m1= new Mafioso("Delinquir");
		m1.disparar();
		m1.generarDni(9534568, "Antonio", "Montana");
		m1.verAntecedentes("Asesino");
		
		
		Detective d1= new Detective("Investigar");
		d1.disparar();
		d1.generarDni(7863789, "Sherlock", "Holmes");
		d1.verAntecedentes("Sin antecedentes");
		
	}

}
