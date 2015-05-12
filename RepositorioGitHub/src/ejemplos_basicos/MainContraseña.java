package curso.ejemplos_basicos;

//import curso.ejemplos_basicos.Contraseņa.TipoFortaleza;

public class MainContraseņa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String password = PedirDatos.pedirContraseņa();
		Contraseņa psw = new Contraseņa(password);
		
		if (psw.esBuena()) {
			
			System.out.println("La contraseņa es " + psw.getFortaleza());
			
		} else {
			
			System.out.println("La contraseņa no es buena, introduzca otra:");
			main(args);
		}

	}

}
