package repaso;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import ejemplos_basicos.PedirDatos;

public class MainListaPersonas {
	
	private final static Logger log = Logger.getLogger("mylog");

	/**
	 * @param args
	 * @throws InsertarPersonaException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws InsertarPersonaException, FileNotFoundException, ClassNotFoundException, IOException {

		ListaPersonas lista = new ListaPersonas();
		Persona p = null;
		int menu = 0;
		boolean salir = false;
		while (!salir)
		{
			menu = (menuInicial());
			switch (menu) {
			case 1:
				p = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
				if (lista.est·Repetido(p)) {
					log.info("La persona que quieres insertar ya est·");
				}else if (lista.estaLlena()) {
					log.info("La lista est· llena");
				}else lista.insertarPersona(p);
				break;
			case 2:
				lista.mostrar();
				break;
			case 3:
				String nombre = PedirDatos.pedirNombre();
				p = lista.buscarPersona(nombre);
				System.out.println(p);
				break;
			case 4:
				int edad = PedirDatos.pedirEdad();
				p = lista.buscarPersona(edad);
				System.out.println(p);
				break;
			case 5:
				int n = lista.numeroPersonas();
				System.out.println(n);
				break;
			case 6:
				lista.eliminarPersona(p = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad()));
				break;
			case 7:
				boolean ser = lista.serializar();
				if (ser) 
				break;
			case 8:
				Persona [] arrayDeserializado = lista.deserializar();
				for (int i=0; i<arrayDeserializado.length; i++) {
					if (arrayDeserializado[i]!= null) {
						System.out.println(arrayDeserializado[i]);
					}
				}
				break;
			case 9: salir = true;
				break;
			default:
				log.info("La opciÛn selecionada no existe");
				break;
			}
			
		}
		
	}
	public static int menuInicial() {
		
		System.out.println("Que quieres hacer?:");
		System.out.println("1 - Insertar nueva persona");
		System.out.println("2 - Ver lista personas");
		System.out.println("3 - Buscar persona por nombre");
		System.out.println("4 - Buscar persona por edad");
		System.out.println("5 - Ver numero personas en la lista");
		System.out.println("6 - Eliminar una persona");
		System.out.println("7 - Guardar la lista en un fichero");
		System.out.println("8 - Mostrar una lista guardada en un fichero");
		System.out.println("9 - Salir");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}

}
