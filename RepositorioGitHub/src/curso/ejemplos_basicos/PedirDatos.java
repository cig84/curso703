package curso.ejemplos_basicos;

import java.util.Scanner;

public class PedirDatos {
	
	public static int i_numeroPersonas() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero de personas: ");
		int i_numeroPersonas = sc.nextInt();
		return i_numeroPersonas;
		
	}
	
	public static String pedirNombre() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nombre: ");
		String s_nombre = sc.next();
		return s_nombre;
		
	}
	
	public static int pedirEdad() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca edad: ");
		byte i_edad = sc.nextByte();
		return i_edad;

	}
	
	public static int pedirNumero() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static String pedirContraseña() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una contraseña: ");
		String psw = sc.next();
		return psw ;
	}
	
	public static int pedirNota() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la nota recibida: ");
		int nota = sc.nextInt();
		if (nota >0 && nota <=10) { 
			return nota;
			} else {
				System.out.println("La nota no es valida, introduzca otra vez la nota:");
				nota = PedirDatos.pedirNota();
				
			}
		return nota;
	}
	
	public static String pedirIdioma() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("En que idioma quiere leer el texto?: ");
		String idioma = sc.next();
		return idioma;
	}
	
//	public static int[] pedirArray() {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduzca la dimensión del array: ");
//		String dim = sc.next();
//		int array[] = new int[dim];
//		return array;
//	}
	
}
