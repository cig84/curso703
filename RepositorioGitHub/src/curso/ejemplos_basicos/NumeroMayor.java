package curso.ejemplos_basicos;

import java.util.Scanner;

public class NumeroMayor {
	
	static int numeroMayor;
	
	/**
	 * Este programa se puede hacer utilizando variables de tipo int 
	 * o instanciando nuevos objetos con atributo de tipo int. A ambos viene
	 * asignado el valor pasado por el usuario
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumeroPedido numero1 = new NumeroPedido(PedirDatos.pedirNumero());
		int numero2 = PedirDatos.pedirNumero();
		int numero3 = PedirDatos.pedirNumero();
		
		if ((numero1.valore>=numero2) && (numero1.valore>=numero3)) {
			
			numeroMayor = numero1.valore;
			
		} else if (numero2>=numero3) {
			
			numeroMayor = numero2;
			
		} else numeroMayor = numero3;
		
		System.out.println("El numero mayor es " + numeroMayor);

	}

}
