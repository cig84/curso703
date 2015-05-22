package xml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainHashMapLibros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String, Libro> libros = new HashMap<String, Libro>();
		
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			HashMapLibroXML libro_xml = new HashMapLibroXML(libros);
			reader.setContentHandler(libro_xml);
			reader.parse(new InputSource(new FileInputStream(".\\carpeta\\libros.xml")));
			
			System.out.println(libros);
			
		} catch (SAXException e) {  
	         e.printStackTrace();  
		} catch (IOException e) {  
	         e.printStackTrace();  
		}  
		
	}

}
