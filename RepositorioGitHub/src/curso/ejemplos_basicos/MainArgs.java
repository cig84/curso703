package curso.ejemplos_basicos;

public class MainArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String straux = null;
		String palabraMayor = null;
		int l = args.length;
		int longitud = 0;
		int longitudMayor = 0;
		int �ndice = 0;
		for (int i=0; i<l; i++) {
			straux = args[i];
			System.out.println(straux);
			longitud = straux.length();
			if (longitud>longitudMayor) {
				longitudMayor = args[i].length();
				palabraMayor = args[i];
				�ndice = i;
			}
		}
		
		System.out.println("La palabra m�s larga es " + palabraMayor + ", est� en la posici�n " + �ndice + " y tiene " + longitudMayor + " car�cteres");
	
	}

}
