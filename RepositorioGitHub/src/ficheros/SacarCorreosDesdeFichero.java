package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class SacarCorreosDesdeFichero {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File ruta = new File(".\\carpeta\\correosElectronicos.txt");
		File rutaFichero = new File(".\\carpeta\\correosElectronicosOrdenados.txt");
		String[] correos = buscarCorreos(ruta);
		String[] soloCorreos = sacarSoloCorreos(correos);
		Arrays.sort(soloCorreos);
		boolean éxito = correosToFichero(soloCorreos, rutaFichero);
		
		if (éxito == true) {
			System.out.println("La escritura del fichero ha terminado con éxito");	
		} else System.out.println("Hubo un problema con la escritura del fichero");
	}
	
	public static String[] buscarCorreos (File ruta) throws IOException {
		
		String[] correos = null;
		String linea;
		String [] arrayL = null;
		int numLineas=0;
		BufferedReader br = null;
		Pattern ini = Pattern.compile("[*]{3}(.*?)[/]{3}");

		if (ruta.exists()&&(ruta.canRead())) {	
			Scanner sc = new Scanner(ruta);
			
			while(sc.hasNextLine()) { 
				String currLine=sc.nextLine(); 
				numLineas++; 
				}	
			arrayL = new String[numLineas];
			correos = new String[numLineas];
			int i=0;
			int j=0;
			br = new BufferedReader(new FileReader(ruta));
			
			while((linea=br.readLine()) != null) {
				arrayL[i] = linea;
				Matcher matIni = ini.matcher(arrayL[i]);
				
				while (matIni.find()) {	
					correos[j] = matIni.group(1);
				}	
				i++;
				j++;
			}					
		} else System.out.println("El fichero no existe o no es legible");
			
		br.close();
		return correos;
	}
	
	public static String[] sacarSoloCorreos (String[] correos) {
		
		String[] arrayCorreos = correos;
		int i=0;
		int j=0;
		int k=0;
		
		for (i=0; i<arrayCorreos.length; i++) {
			
			if (arrayCorreos[i]!=null) {
				j++;
			} 	
		}
		String[] arrayCorreosReducido = new String[j];
		
		for (i=0; i<arrayCorreos.length; i++) {
			
			if (arrayCorreos[i]!=null) {
				arrayCorreosReducido[k]=arrayCorreos[i];
				k++;
			} 
		}		
		return arrayCorreosReducido;	
	}
	
	public static boolean correosToFichero(String[] fichero, File rutaFichero) throws IOException {
		
		boolean realizado = false;
		BufferedWriter bw = null;
		rutaFichero.createNewFile();
		
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
		bw.close();
		return realizado;
	}
}

