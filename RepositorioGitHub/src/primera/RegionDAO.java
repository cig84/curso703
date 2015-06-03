package evaluacion.primera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegionDAO {
	
	private static RegionDTO componerObjeto (ResultSet rs) throws SQLException {
		RegionDTO region = null;
		
		int region_Id = rs.getInt(1);
		String region_Name = rs.getString(2);
		
		region = new RegionDTO(region_Id, region_Name);
		
		return region;
	}
	
	public static RegionDTO recuperarPorIdentificador () throws SQLException {
		
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionDTO regionDTO = null;

		try {
			
			conexion = Conexión.obtenerConexion();
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
			Conexión.liberarRecursos(conexion, stmt, rs);
		}
		
	}
	
	public static void insertarNueva () throws SQLException {
		
		Connection conexion = null;
		Statement stmt = null;

		
		try {
			conexion = Conexión.obtenerConexion();
			stmt = conexion.createStatement();
			stmt.executeQuery(InstruccionesSQL.INSERTAR_NUEVA);
		
		}
		catch (SQLException e){
			e.printStackTrace();
			throw e;
		}
		finally{
			Conexión.liberarRecursos(conexion, stmt);
		}
		
	}
	
	public static List<RegionDTO> obtenerTodas () throws SQLException {
		
		List<RegionDTO> lista_regiones = null;
		Connection conexion = null;
		Statement stmt = null;
		ResultSet rs = null;
		RegionDTO regionDTO = null;
		
		try {
			conexion = Conexión.obtenerConexion();
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
			Conexión.liberarRecursos(conexion, stmt, rs);
		}
		
		return lista_regiones;
	}

}
