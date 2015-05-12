package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class StoryProperties {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties propiedades = new Properties();

		switch (args[0]){	
		case "EN":
			propiedades.load(new FileInputStream(".\\carpeta\\story_en.properties"));
			toFichero(propiedades);
			break;
		case "ES":
			propiedades.load(new FileInputStream(".\\carpeta\\story_es.properties"));
			toFichero(propiedades);
			break;
		case "IT":
			propiedades.load(new FileInputStream(".\\carpeta\\story_it.properties"));
			toFichero(propiedades);
			break;
		default: System.out.println("No hay cuento en este idioma");
			break;
		}	
	}
	
	public static void toFichero(Properties propiedades) throws IOException {
		
		String start = propiedades.getProperty("start");
		String body = propiedades.getProperty("body");
		String end = propiedades.getProperty("end");
		FileWriter fw = new FileWriter(".\\carpeta\\" + propiedades.getProperty("outfile"));
		fw.write(start + "\n" + body + "\n" + end);
		fw.close();
	}
}