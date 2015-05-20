package curso.ejemplos_basicos;

public class CompararString {
	
	/**
	 * devuelve siempre 'false' porque se re refiere a la memoria
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String palabra1 = new String ("A");
		String palabra2 = new String ("A");
		
		boolean iguales;
		if (palabra1 == palabra2) {
			iguales = true;
		} else iguales = false;
		
		System.out.println(palabra1 + " " + palabra2 + " " + iguales);
	}

}
