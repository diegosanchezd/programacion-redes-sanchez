package guia_uno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class reader {
	
	public static PrintStream ps = new PrintStream( System.out );
	
	public static String reading(String preg){
		System.out.flush();		
		try{
			ps.print(preg);
			
			int byteNum= 0;
			String str= "";
			
			while( (byteNum = System.in.read()) != '\n'){
				if(byteNum != '\r')
					str += (char)byteNum;
			}
			
			return str;
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return "";
	}
	
	public static int readerInt(String preg){
		String str= reading(preg);
		int num= Integer.parseInt(str);
		return num;
	}
	
	public static double readerDouble(String preg){
		String str= reading(preg);
		double num= Double.parseDouble(str);
		return num;
	}
	
	//_________LEER CON READER: 
	public static String leerReader(String preg) {
		System.out.flush();		
		InputStreamReader obj = new InputStreamReader( System.in );
		ps.print(preg);
		int Byte= 0;
		String cadena="";
		try {
			while( ( Byte = obj.read() ) != '\n' ) {
				if(Byte != '\r') {
					cadena += (char)Byte;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return cadena;
	}
	
	//_________LEER INT CON READER: 
	public static int leerReaderInt(String preg) {
		String text=  leerReader(preg);
		return Integer.parseInt(text);
	}
	
	//_________LEER DOUBLE CON READER: 
	public static double leerReaderDouble(String preg) {
		String text=  leerReader(preg);
		return Double.parseDouble(text);
	}
	
	//_________LEER CON BUFFEREDREADER: 
	public static String leerBufferedReader(String preg) {
		System.out.flush();		
		InputStreamReader isr= new InputStreamReader( System.in );
		BufferedReader br= new BufferedReader( isr );
		String text= "";
		ps.print(preg);
				try {
					text= br.readLine();
				}catch( IOException e) {
					e.printStackTrace();
				}			
		return text;	
	}

	//_________LEER INT CON BUFFEREDREADER: 
	public static int leerIntBufferedReader(String preg) {
		String text=  leerReader(preg);
		return Integer.parseInt(text);
	}
	
	//_________LEER DOUBLE CON BUFFEREDREADER: 
	public static double leerDoubleBufferedReader(String preg) {
		String text=  leerReader(preg);
		return Double.parseDouble(text);
	}
	
}
