package repaso;

import ejemplos_basicos.PedirDatos;

public class NumeroParDispar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numero = PedirDatos.pedirNumero();
		if (numero%2 == 0) {
			
			System.out.println("El número es par");
		
		} else System.out.println("El número es impar");
	}

}
