package curso.ejemplos_basicos;

//import curso.ejemplos_basicos.Contraseña.TipoFortaleza;

public class MainContraseña {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String password = PedirDatos.pedirContraseña();
		Contraseña psw = new Contraseña(password);
		
		if (psw.esBuena()) {
			
			System.out.println("La contraseña es " + psw.getFortaleza());
			
		} else {
			
			System.out.println("La contraseña no es buena, introduzca otra:");
			main(args);
		}

	}

}
