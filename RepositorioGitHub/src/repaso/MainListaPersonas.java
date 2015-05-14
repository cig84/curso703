package ejercicios.de.repaso;

import java.util.Scanner;

import curso.ejemplos_basicos.PedirDatos;

public class MainListaPersonas {

	/**
	 * @param args
	 * @throws InsertarPersonaException 
	 */
	public static void main(String[] args) throws InsertarPersonaException {

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
				lista.insertarPersona(p);
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
				boolean ser = lista.serializar();
				if (ser) 
				break;
			case 7:
				Persona [] arrayDeserializado = lista.deserializar();
				break;
			case 8: salir = true;
				break;
			default:
				System.out.println("La opción selecionada no existe");
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
		System.out.println("6 - Guardar la lista en un fichero");
		System.out.println("7 - Mostrar una lista guardada en un fichero");
		System.out.println("8 - Salir");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}

}
