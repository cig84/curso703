package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopiarFicheroDeBytes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File ruta = new File(".\\carpeta\\Evaluacion.pdf");
		File rutaNuevo = new File(".\\carpeta\\EvaluacionCopia.pdf");
		boolean éxito = copiaFichero(ruta, rutaNuevo);
		if (éxito == true) {
			System.out.println("La escritura del fichero ha terminado con éxito");
		} else System.out.println("Hubo un problema con la escritura del fichero");

	}
	
	public static boolean copiaFichero(File ruta, File rutaNuevo) {
		
		boolean realizado = false;
		FileInputStream is = null;
		FileOutputStream os = null;
		int linea;
		
		try {
			rutaNuevo.createNewFile();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {

			if (ruta.exists()&&(ruta.canRead())) {
				
				is = new FileInputStream(ruta);
				os = new FileOutputStream(rutaNuevo);
				while((linea = is.read()) != -1) {
					os.write(linea);
					System.out.println(linea);
				}
				realizado = true;
			
			} else {System.out.println("El fichero no existe o no es legible");
			}
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			
			if (is != null && os != null)
				try {
					is.close();
					os.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			System.out.println("Termino del file");
		}
		
		return realizado;
	}

}
