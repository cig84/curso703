package repaso;

import ejemplos_basicos.PedirDatos;

public class VecesCaracterEnCadena {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String straux = PedirDatos.pedirNombre();
		char caracter = 'o';
		int l = straux.length();
		int vecesCaracter = 0;
		for (int i=0; i<l; i++) {
			
			if (straux.charAt(i) == caracter) {
				
				vecesCaracter++;
			
				}
			}
		
		System.out.println("La letra '" + caracter + "' está contenida " + vecesCaracter + " veces nel String '" + straux + "'");

	}

}
