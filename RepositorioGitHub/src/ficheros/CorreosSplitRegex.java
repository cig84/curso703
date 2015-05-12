package ficheros;

public class CorreosSplitRegex {
	
	public static void main(String[] args) {
		
		String linea = "asfadfb//**jp349iu'***hola@madrid.org///0sdg/***francesco@roma.org///*99sdg***cig84@hotmail.it///";
			//Dada una l�nea como las del ejemplo
		
		String expresion_regular_mails = "[\\S\\s]*[\\*\\*\\*]{1}[\\S]+@[\\S]+/{3}[\\S\\s]*";
			//escribirmos una expresi�n regular que la define y su significado ser�a:
			//Cualquier caracter (S) o espacio en blanco (s), de O a N veces (*)
			//seguido de un conjunto {1} de 3 asteriscos \\*
			//seguido de cualquier caracter (S) de 1 a N veces (+)
			//seguido de una arroba (@) 1 vez - simplemente @ -
			//seguido de 3 barras /{3}
			//y seguido de O a N (*) caracteres (S) o espacios en blanco(s)
		
		String expresion_regular_mails2 = "[\\*\\*\\*]{1}[\\S]+@[\\S]+/{3}";
			//Ahora, escribmos una expresi�n regular que defina el patr�n de aparici�n de un e-mail
			//3 asteriscos
			//seguido de cualquier caracter
			//terminado con 3 barras
		
		String expresion_regular_mails3 = ".\\*{3}";
		String expresion_regular_mails4 = "/{3}.*";
			
		String[] devolucion = linea.split(expresion_regular_mails3); //Troceame en subcadenas, la cadena linea, usando como separador la expresi�n regular dada
		String[] div = new String[devolucion.length];
		for (int i=0; i<devolucion.length; i++) {
			int j=0;
			if (devolucion[i].contains("///")) {
				 
				div = devolucion[i].split(expresion_regular_mails4); //Troceame en subcadenas, la cadena linea, usando como separador la expresi�n regular dada
				if (div[j].contains("@")) {
					
					System.out.println(div[j]);			
				}

				j++;
				
			}
		}
		
		/**
		 * Al ejecutar el c�digo, el operador split, nos devuelve las substrings de l�nea, eliminado la expresi�n regular
		 * que describe la aparici�n de un mail.
		 * 
		 * SE PIDE --> Construir una o m�s  expresiones regulares que hagan lo opuesto: es decir, que quite la informaci�n no relevante
		 * y extraiga los mails, de forma que el uso de split, nos de la lista de mails en un array de Strings
		 * 
		 * Una vez conseguido, aplicar al ejemplo anterior
		 */
		
	}
}