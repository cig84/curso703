package curso.ejemplos_basicos;

//import curso.ejemplos_basicos.Contrase�a.TipoFortaleza;

public class MainContrase�a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String password = PedirDatos.pedirContrase�a();
		Contrase�a psw = new Contrase�a(password);
		
		if (psw.esBuena()) {
			
			System.out.println("La contrase�a es " + psw.getFortaleza());
			
		} else {
			
			System.out.println("La contrase�a no es buena, introduzca otra:");
			main(args);
		}

	}

}
