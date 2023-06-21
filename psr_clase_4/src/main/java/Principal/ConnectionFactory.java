package Principal;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	
	//______CONEXION A LA BD_______
	
	PrintStream p = new PrintStream( System.out );
	Connection conn;
	
	public ConnectionFactory() {	
		try {
			Class.forName( "com.mysql.cj.jdbc.Driver" );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn= DriverManager.getConnection( "jdbc:mysql://localhost:3306/usuarios", "root", "" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	String query= "SELECT * from empleado";
	PreparedStatement ps = null;
	
	try {
		ps = conn.prepareStatement(query);
		//ps.setString(1 , "empleado");
		//ps.setString(2, "nombre");
		//ps.setString(3, "Diego");
		
		ResultSet rs= ps.executeQuery();
		
		while(rs.next()) {
			p.println(rs.getInt("id"));
			p.println(rs.getString("nombre"));
			p.println(rs.getString("apellido"));
			p.println(rs.getInt("rol"));
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
