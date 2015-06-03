package evaluacion.primera;

import java.sql.SQLException;
import java.util.List;

public class MainRegionDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<RegionDTO> lista_regiones;
		RegionDTO regionDTO;
		try {
//			RegionDAO.insertarNueva();
			regionDTO = RegionDAO.recuperarPorIdentificador();
			lista_regiones = RegionDAO.obtenerTodas();
			System.out.println(regionDTO);
			System.out.println(lista_regiones);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
