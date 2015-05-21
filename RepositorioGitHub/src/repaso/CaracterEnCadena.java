package repaso;

public class CaracterEnCadena {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String straux = "Esto es un ejercicio para ver si un caracter está contenido en un String";
		String caracter = "o"; 
		int hay = straux.indexOf(caracter);
		if (hay != -1) {
			
			boolean contiene = true;
			System.out.println("La letra '" + caracter + "' está contenida nel String 'Esto es un ejercicio para ver si un caracter está contenido en un String'");
		
		} else System.out.println("La letra '" + caracter + "' no está contenida nel String '" + straux + "'");

	}

}
