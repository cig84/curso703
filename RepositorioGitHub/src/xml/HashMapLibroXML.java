package xml;

import java.util.HashMap;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HashMapLibroXML extends DefaultHandler{
	
	private String valor = null;  
     
	private Libro libro;  
	private HashMap<String, Libro> lhm = new HashMap<String, Libro>();
	     
	public HashMapLibroXML(HashMap<String, Libro> hmlibros){  
		
		this.lhm=hmlibros; 
	    this.libro=new Libro();
	   }  
	     
	   @Override  
	public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException { 
		   
		   // Limpiamos la variable temporal.  
		   valor=null;  
	        
	      // Si la etiqueta es libro leemos el atributo isbn  
		   if(localName.equals("libro")){  
			   
			   String isbn = attributes.getValue("isbn");  
			   // Lo guardamos en el objeto libro  
			   libro.setIsbn(isbn);  
		   }  
	   }  
	     
	   @Override  
	public void characters(char[] ch, int start, int length) 
	   
	   throws SAXException {  
	   // Guardamos el texto en la variable temporal  
	   valor = new String(ch,start,length);  

	   }  
	  
	   @Override  
	public void endElement(String uri, String localName, String name) throws SAXException { 
		   
		   // Según la etiqueta guardamos el valor leido   
		   // en una propiedad del objeto libro  
		   if (localName.equals("titulo")){  
			   libro.setTitulo(valor);  
		   }else if (localName.equals("autor")){  
			   libro.setAutor(valor);  
		   }else if (localName.equals("anyo")){  
			   libro.setAnyo(valor);  
		   }else if (localName.equals("editorial")){  
			   libro.setEditorial(valor);
			   lhm.put(libro.getIsbn(), libro);
			   libro = new Libro();
		   } 
	        
	   }  
	  
}  