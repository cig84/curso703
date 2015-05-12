package ficheros;

import java.io.*;

public class RecorrerSF {

	/**
	 * Programa que recorre un arbol de directorios de forma recursiva.
	 * @param args
	 */
	public static void main(String[] args) {

		File f = new File(".");
		File[] files = f.listFiles();
		recorrerRuta(f, files);

	}
	/**
	 * Este método es recursivo. Recorro el array que contiene el listado de ficheros
	 * de la ruta pasada como argumento. Imprimo el nombre del fichero y si es 
	 * un directorio llamo recursivamente el método con los parametros actualizados. 
	 * @param f es un objeto de tipo File que contiene la ruta.
	 * @param files es un array que contiene el listado de los ficheros contenidos en
	 * 		  la ruta de'f'.
	 */
	public static void recorrerRuta(File f, File[] files) {
		
		if (f.exists()) {
			
			for (int i=0; i<files.length; i++) {
				
				System.out.println(files[i].getName());
				if (files[i].isDirectory()) {
					
					File[] files2 = files[i].listFiles();
					recorrerRuta (files[i], files2);
					
				} 
			}
			
		} else System.out.println("El directorio no existe");
		
	}

}
