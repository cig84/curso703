package evaluacion.primera;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexión {
	
	private static Conexión conexion = new Conexión();
	private Connection connection;
	
	private Conexión() {
	
		String s_driver = "oracle.jdbc.driver.OracleDriver";
		String cadena_conexion = "jdbc:oracle:thin:@localhost:1521:xe";
		String usuario = "HR";
		String contrasenia = "database";
		try {
			Class.forName(s_driver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver((Driver) Class.forName(s_driver).newInstance());
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			this.connection = DriverManager.getConnection(cadena_conexion, usuario, contrasenia);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}
	
	public static Connection obtenerConexion ()	{
		
		return conexion.connection;
	}
	
	public static void liberarRecursos (Connection conn, Statement stmt, ResultSet rset) {
		
		if (rset != null) 	{ try { rset.close(); } catch (Exception e1) { e1.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
	
	public static void liberarRecursos (Connection conn, Statement stmt) {
		
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}

}
