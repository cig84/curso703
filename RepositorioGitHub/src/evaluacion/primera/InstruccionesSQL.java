package evaluacion.primera;

public class InstruccionesSQL {
	
	/* consultas para insertar nueva región, recuperar un registro por el identificador de una región
	   y recuperar toda la lista de regiones */
	public static final String INSERTAR_NUEVA = "INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES (6, 'Antartica')";
	public static final String RECUPERAR_POR_IDENTIFICADOR = "SELECT * FROM REGIONS WHERE REGION_ID = 3";
	public static final String CONSULTAR_TODAS = "SELECT * FROM REGIONS";

}
