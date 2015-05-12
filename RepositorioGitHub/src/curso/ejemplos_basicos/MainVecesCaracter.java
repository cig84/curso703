package curso.ejemplos_basicos;

public class MainVecesCaracter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int l = args.length -1;
		String straux = null;
		String caracter = null;
		caracter = args[l];
		int lArgs = 0;
		int vecesCaracter = 0;
		for (int i=0; i<l; i++) {
			straux = args[i];
			System.out.println(straux);
			lArgs = straux.length();
			for (int j=0; j<lArgs; j++) {
				if (straux.charAt(j) == caracter.charAt(0)) {
					vecesCaracter++;
				}
			}
		}
		
		System.out.println("La letra '" + caracter + "' está contenida " + vecesCaracter + " veces");

	}

}
