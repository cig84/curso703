package curso.ejemplos_basicos;

public class MainSumaParametros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 5;
		porValor(a); // a es un parametro actual
		System.out.println(a);
		System.out.println();

	}
	
	public static void porValor (int a) { // a es un parametro formal
											
		a = a+7;
	}

}
