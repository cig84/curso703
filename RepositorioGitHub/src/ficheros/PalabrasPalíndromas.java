package ficheros;

import java.util.Scanner;

/**
 * 
 * 
 * @author Val
 *
 *El c�digo de esta clase, es un poco misterioso. Alg�n programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qu� narices hace este c�digo, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del m�todo adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al m�todo y a la clase
 *3) Idear un m�todo equivalente, pero distinto. Es decir, crear un m�todo 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: S�lo si resolviste los puntos anteriores, implementa una versi�n recursiva
 *
 */
public class PalabrasPal�ndromas {
	
	private static boolean ComprobarPalabrasPal�ndromas (String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		
		return bd;
	}
	
	public static boolean Palindr�micos (String cad) {
		
		boolean pal = true;
		int longitud = cad.length();
		int i = 0;
		int j = (longitud -1);
		for (i=0; (i<=j)&&(pal);) {
			
			pal = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		return pal;
	}
	
	public static boolean Palindr�micosRecursivo (String cad, int i, int j) {
		
		boolean palRec = true;
		if ((i<=j) && ((palRec = cad.charAt(i)==cad.charAt(j))==true)) {
			i++;
			j--;
			palRec = Palindr�micosRecursivo(cad, i, j);
		} 
		return palRec;
	}
	
public static String pedirPalabra() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca palabra: ");
		String palabra = sc.next();
		return palabra;
		
	}
	
	public static void main(String[] args) {
		
		String palabra = pedirPalabra();
		
		int longitud = palabra.length()-1;
		
		if ((ComprobarPalabrasPal�ndromas(palabra)))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
		
		if ((Palindr�micos(palabra)))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
		
		if ((Palindr�micosRecursivo(palabra, 0, longitud)))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
	}

}