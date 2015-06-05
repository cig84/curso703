package evaluacion.primera;

public class RegionDTO {
	
	private int region_Id;
	private String region_Name;
	
	/* constructor de la clase RegionDTO. Cada objeto contiene dos atributos, int y String, que 
	 * conresponden a los valores region_Id y region_Name de la tabla Region en la Base de Datos.
	 * Hay también métodos que devuelven el valor de los atributos del objeto y sobreescriven el 
	 * método toString para imprimir el objeto en la pantalla.*/
	public RegionDTO(int region_Id, String region_Name) {
			
		this.region_Id = region_Id;
		this.region_Name = region_Name;
	}

	public int getRegion_Id() {
		return region_Id;
	}
	public String getRegion_Name() {
		return region_Name;
	}
	
	@Override
	public String toString() {
		return region_Id + " " + region_Name;
	}

}
