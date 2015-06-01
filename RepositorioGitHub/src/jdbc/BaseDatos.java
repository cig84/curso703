package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BaseDatos {
	
	
	public static void main(String[] args) throws Exception {
		
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		
		try
		{
			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			ArrayList<Empleado> arrEmp = new ArrayList<Empleado>();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "database");
  	        stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from EMPLOYEES WHERE (SALARY > 3000)");
			while (rset.next()) {
			     
			     Empleado emp = new Empleado(rset.getInt("EMPLOYEE_ID"), rset.getString("FIRST_NAME"), 
			    		 rset.getString("LAST_NAME"), rset.getString("EMAIL"), rset.getString("PHONE_NUMBER"), 
			    		 rset.getString("HIRE_DATE"), rset.getString("JOB_ID"), rset.getInt("SALARY"), 
			    		 rset.getInt("COMMISSION_PCT"), rset.getInt("MANAGER_ID"), rset.getInt("DEPARTMENT_ID"));
			     arrEmp.add(emp);

			}
			System.out.println (arrEmp);
			    						   
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
		}   

	}

}

