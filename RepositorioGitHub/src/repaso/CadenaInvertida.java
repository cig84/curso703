package repaso;

import ejemplos_basicos.PedirDatos;

public class CadenaInvertida {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String straux = PedirDatos.pedirNombre();
		int lenght = straux.length() -1;
		String cadenaReves = "";
		for (int i=lenght; i>=0; i--) {
			
			cadenaReves = cadenaReves + straux.charAt(i);
		}
		
		System.out.println(cadenaReves);
	}

}
