package ficheros;

import java.io.*;
import java.util.*;

public class AlmacenarFicheroDeTexto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File ruta = new File(".\\carpeta\\Enlaces para profundizar.txt");
		File rutaFichero = new File(".\\carpeta\\miFichero.txt");
		String[] fichero = ficheroToArray(ruta);
		boolean éxito = arrayToFichero(fichero, rutaFichero);
		if (éxito == true) {
			System.out.println("La escritura del fichero ha terminado con éxito");
		} else System.out.println("Hubo un problema con la escritura del fichero");

	}
	
	public static String[] ficheroToArray(File ruta) {
		
		String linea;
		String [] arrayL = null;
		int numLineas=0;
		BufferedReader br = null;
		
		try {

			if (ruta.exists()&&(ruta.canRead())) {
				
				Scanner iterate = new Scanner(ruta);
				while(iterate.hasNextLine()) { 
					String currLine=iterate.nextLine(); 
					numLineas++; 
					}
				arrayL = new String[numLineas];
				int i=0;
				br = new BufferedReader(new FileReader(ruta));
				while((linea=br.readLine()) != null) {
					arrayL[i] = linea;
					System.out.println(arrayL[i]);
					i++;
				}
			
			} else {System.out.println("El fichero no existe o no es legible");
			}
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			System.out.println("Termino del file");
		}
		
		return arrayL;
	}
	
	public static boolean arrayToFichero(String[] fichero, File rutaFichero) {
		
		boolean realizado = false;
		BufferedWriter bw = null;
		
		try {
			rutaFichero.createNewFile();
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			bw = new BufferedWriter(new FileWriter(rutaFichero));
			if (rutaFichero.exists()&&(rutaFichero.canWrite())) {
				
				int i=0;
				do {
					bw.write(fichero[i]);
					bw.newLine();
					System.out.println(fichero[i]);
					i++;
					
				}
				while(i<fichero.length);
				realizado = true;
			
			}
		} catch(Exception e2) {
			e2.printStackTrace();
			
		} finally {
			
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	
		}
	
		return realizado;
	}


}
