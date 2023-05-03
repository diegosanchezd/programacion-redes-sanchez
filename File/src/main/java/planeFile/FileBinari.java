package planeFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileBinari implements Serializable {
	
	private static final long serialVersionUID = 971334L;
	
	public void serializar( String ruta) throws IOException {
		
		File archivo= new File(ruta);
		FileOutputStream fos= new FileOutputStream(archivo); //FileOutputStream es el canal de comunicacion
		
		//para escribir en memoria RAM
		ObjectOutputStream  escribir = new ObjectOutputStream( fos );
		escribir.writeObject( this );
		escribir.close();
		
		
	}
	
	public FileBinari deserializar(String ruta) throws IOException, ClassNotFoundException {
		File archivo= new File(ruta);
		FileInputStream fis = new FileInputStream(archivo);
		
		ObjectInputStream lector= new ObjectInputStream( fis );
		
		return (FileBinari)lector.readObject();
	}	
	
}
