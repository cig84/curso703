package evaluacion.primera;

import java.sql.SQLException;
import java.util.List;

public class MainRegionDAO {

	/**
	 * @param args
	 * Este programa interactúa con la base de datos de Oracle y realiza consultas sobre la tabla "Regions".
	 */
	public static void main(String[] args) {
		
		List<RegionDTO> lista_regiones;
		RegionDTO regionDTO;
		try {
			TestRegionDAO.insertarNueva();
			regionDTO = TestRegionDAO.recuperarPorIdentificador();
			lista_regiones = TestRegionDAO.obtenerTodas();
			System.out.println(regionDTO);
			System.out.println(lista_regiones);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
