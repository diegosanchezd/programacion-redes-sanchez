package guia_uno;

import java.io.IOException;
import java.io.PrintStream;

public class reader {
	
	
	public static PrintStream ps;
	
	public static String reading(String preg){
		System.out.flush();
		
		ps= new PrintStream(System.out);
		
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
		
		return ":)";
		
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
	
}
