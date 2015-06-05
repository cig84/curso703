package evaluacion.primera;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexi�n {
	
	/* esta clase permite establecer una conecci�n con la base de datos para hacer consultas. */
	private static Conexi�n conexion = new Conexi�n();
	private Connection connection;
	
	private Conexi�n() {
		
	/* el constructor de la clase que permite obtener una conneccion con la base de datos.
	 * Para esto necesitamos un driver, una cadena de conecci�n, el usuario y la contrase�a. */
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
	
	public static Connection obtenerConexion () throws SQLException	{
		
		/* este m�todo crea la conecci�n a la base de datos a trav�s del metodo fetConnection de la clase
		 * DriverManager. */
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "database");
	}
	
	public static void liberarRecursos (Connection conn, Statement stmt, ResultSet rset) {
		
		/* este m�todo l�bera los recursos utilizados. */
		if (rset != null) 	{ try { rset.close(); } catch (Exception e1) { e1.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
	
	public static void liberarRecursos (Connection conn, Statement stmt) {
		
		/* este m�todo est� sobrecargado y l�bera solo los recursos de tiop Connection y Statement dado
		 * que no siempre necesitamos de un ResultSet. */
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}

}
