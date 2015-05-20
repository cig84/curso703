package curso.ejemplos_basicos;

public class Prueba {

	public int calcula() {

		return 1 + 1;
	}

	public static void main(String[] argumentos) {

		int resultado = 0;
		Prueba prueba = null; /*
							 * declaración y inicialización de un objeto de la
							 * clase "Prueba"
							 */
		prueba = new Prueba(); /*
								 * instancio un objeto de Prueba. "prueba" es un
								 * objeto de la clase, "Prueba" es un
								 * constructor por defecto. La memoria que viene
								 * reservada por el objeto es la maxima que
								 * necesita el pbjecto de este tipo
								 */

		prueba.calcula(); /*
						 * logra llamar calcula porqué prueba es un objeto de
						 * Prueba
						 */

		resultado = prueba.calcula(); /*
									 * resultado es una variabile auxiliar. En
									 * este caso es también local
									 */
		System.out.println(resultado);
	}

}
