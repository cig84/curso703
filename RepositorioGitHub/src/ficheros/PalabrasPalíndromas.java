package ficheros;

import java.util.Scanner;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class PalabrasPalíndromas {
	
	private static boolean ComprobarPalabrasPalíndromas (String cad)
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
	
	public static boolean Palindrómicos (String cad) {
		
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
	
	public static boolean PalindrómicosRecursivo (String cad, int i, int j) {
		
		boolean palRec = true;
		if ((i<=j) && ((palRec = cad.charAt(i)==cad.charAt(j))==true)) {
			i++;
			j--;
			palRec = PalindrómicosRecursivo(cad, i, j);
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
		
		if ((ComprobarPalabrasPalíndromas(palabra)))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
		
		if ((Palindrómicos(palabra)))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
		
		if ((PalindrómicosRecursivo(palabra, 0, longitud)))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
	}

}