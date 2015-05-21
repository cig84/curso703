package repaso;

import ejemplos_basicos.PedirDatos;

public class PersonaMayor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int MAYOR_EDAD = 18;
		int edad = PedirDatos.pedirEdad();
		
		if (edad>=MAYOR_EDAD) {
			
			System.out.println("Eres mayor de edad");
			
			} else {
				
				System.out.println("No eres mayor de edad");
			}
		
	}

}
