package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.Arrays;

public class SacarOrdenarCorreos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File ruta = new File(".\\carpeta\\correosElectronicos.txt");
		File rutaFichero = new File(".\\carpeta\\correosElectronicosOrdenados.txt");
		String correos = buscarCorreos(ruta);
		ordenarCorreos(correos, rutaFichero);
	}
	
	public static String buscarCorreos (File ruta) {
		
		String linea;
		BufferedReader br = null;
		Pattern ini = Pattern.compile("[*]{3}(.*?)[/]{3}");
		String arrayCorreos = null;
		try {

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
		}
		return arrayCorreos;
	}
	
	public static String sacarSoloCorreos (String correos, String arrayCorreos) {
		
		arrayCorreos = arrayCorreos + " " + correos;
		return arrayCorreos;
		
	}
	
	public static void ordenarCorreos (String correos, File rutaFichero) {
		
		try {
		    String[] splitArray = correos.split("\\s+");
		    Arrays.sort(splitArray);
		    boolean éxito = correosToFichero(splitArray, rutaFichero);
		    if (éxito == true) {
				System.out.println("La escritura del fichero ha terminado con éxito");
			} else System.out.println("Hubo un problema con la escritura del fichero");
		} catch (PatternSyntaxException ex) {
		     
		}
	}
	
public static boolean correosToFichero(String[] fichero, File rutaFichero) {
		
		boolean éxito = true;
		BufferedWriter bw = null;
		
		try {
			rutaFichero.createNewFile();
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
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
		
		return éxito;
	}
}