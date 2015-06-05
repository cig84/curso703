package evaluacion.primera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/* esta clase es la que tiene los metodos que nos permiten interactuar con la base de datos. */
public class RegionDAO {
	
	/* este m�todo devuelve un objeto RegionDTO insertando los valores devueltos por la consulta
	 * en los atributos apropriados del objeto. Est� utilizado por los m�todos (recuperarPorIdentificador()
	 * y obtenerTodas() que necesitan crear un nuevo objeto RegionDTO por cada registro devuelto
	 * por la consulta.  */
	private static RegionDTO componerObjeto (ResultSet rs) throws SQLException {
		RegionDTO region = null;
		
		int region_Id = rs.getInt(1);
		String region_Name = rs.getString(2);
		
		region = new RegionDTO(region_Id, region_Name);
		
		return region;
	}
	
	public static RegionDTO recuperarPorIdentificador () throws SQLException {
	
		/* este m�todo devuelve un objeto RegionDTO despues de la consulta RECUPERAR_POR_IDENTIFICADOR.
		 * Para hacer la consulta necesitamos obtener una conecci�n con la base de datos y poner el
		 * resultado en un objeto ResultSet desde el cual componeremos el objeto RegionDTO. Al final
		 * vamos a liberar los recursos utilizados. */	
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionDTO regionDTO = null;

		try {
			
			conexion = Conexi�n.obtenerConexion();
			stmt = conexion.createStatement();
			rs = stmt.executeQuery(InstruccionesSQL.RECUPERAR_POR_IDENTIFICADOR);
			
			while(rs.next()){
				regionDTO = componerObjeto(rs);
			}
			return regionDTO;
		
		}
		catch (SQLException e){
			e.printStackTrace();
			throw e;
		}
		finally{
			Conexi�n.liberarRecursos(conexion, stmt, rs);
		}
		
	}
	
	public static void insertarNueva () throws SQLException {
		
		/* este m�todo obtiene una conecci�n y ejecuta una consulta para insertar un nuevo registo en la
		 * tabla. Al final vamos a liberar los recursos. */
		Connection conexion = null;
		Statement stmt = null;

		
		try {
			conexion = Conexi�n.obtenerConexion();
			stmt = conexion.createStatement();
			stmt.executeQuery(InstruccionesSQL.INSERTAR_NUEVA);
		
		}
		catch (SQLException e){
			e.printStackTrace();
			throw e;
		}
		finally{
			Conexi�n.liberarRecursos(conexion, stmt);
		}
		
	}
	
	public static List<RegionDTO> obtenerTodas () throws SQLException {
		
		/* este m�todo devuelve un objeto Lista<RegionDTO> contenente objetos RegionDTO creados por
		 * el m�todo componerObjeto() que recive un ResultSet con el resultado de la consulta y a�adidos
		 * a la Lista con el m�todo add() de la propria clase Lista. Al final vamos a liberar recursos. */
		List<RegionDTO> lista_regiones = null;
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionDTO regionDTO = null;
		
		try {
			conexion = Conexi�n.obtenerConexion();
			stmt = conexion.createStatement();
			rs = stmt.executeQuery(InstruccionesSQL.CONSULTAR_TODAS);
			lista_regiones = new ArrayList<RegionDTO>();
			while (rs.next())
			{
				regionDTO = componerObjeto(rs);
				lista_regiones.add(regionDTO);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
			lista_regiones = null;
			throw e;
		}
		finally{
			Conexi�n.liberarRecursos(conexion, stmt, rs);
		}
		
		return lista_regiones;
	}

}
