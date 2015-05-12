package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class SacarOrdenarCorreos {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File ruta = new File(".\\carpeta\\correosElectronicos.txt");
		File rutaFichero = new File(".\\carpeta\\correosElectronicosOrdenados.txt");
		String correos = buscarCorreos(ruta);
		ordenarCorreos(correos, rutaFichero);
	}
	
	public static String buscarCorreos (File ruta) throws IOException {
		
		String linea;
		BufferedReader br = null;
		Pattern ini = Pattern.compile("[*]{3}(.*?)[/]{3}");
		String arrayCorreos = null;

		if (ruta.exists()&&(ruta.canRead())) {
			int i=0;
			br = new BufferedReader(new FileReader(ruta));
			
			while((linea=br.readLine()) != null) {
				Matcher matIni = ini.matcher(linea);
				
				while (matIni.find()) {
					linea = matIni.group(1);
					
					if (i==0) {
					arrayCorreos = linea;
					} else arrayCorreos = sacarSoloCorreos(linea, arrayCorreos);
					i++;
				}	
			}
		} else System.out.println("El fichero no existe o no es legible");
		br.close();
		return arrayCorreos;
	}
	
	public static String sacarSoloCorreos (String correos, String arrayCorreos) {
		
		arrayCorreos = arrayCorreos + " " + correos;
		return arrayCorreos;
	}
	
	public static void ordenarCorreos (String correos, File rutaFichero) throws IOException {
				
		String[] splitArray = correos.split("\\s+");
		Arrays.sort(splitArray);
		boolean éxito = correosToFichero(splitArray, rutaFichero);
		
		if (éxito == true) {
			System.out.println("La escritura del fichero ha terminado con éxito");
		} else System.out.println("Hubo un problema con la escritura del fichero");
	}
	
	public static boolean correosToFichero(String[] fichero, File rutaFichero) throws IOException {
		
		boolean éxito = true;
		BufferedWriter bw = null;
		rutaFichero.createNewFile();
		bw = new BufferedWriter(new FileWriter(rutaFichero));
		int i=0;
		
		if (rutaFichero.exists()&&(rutaFichero.canWrite())) {
				
			while (i<fichero.length) {
			bw.write(fichero[i]);
			bw.newLine();
			System.out.println(fichero[i]);
			i++;
			}
		}
		bw.close();
		return éxito;
	}
}