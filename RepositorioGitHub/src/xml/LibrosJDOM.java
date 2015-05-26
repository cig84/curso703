package xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.Adler32;

import javax.print.attribute.standard.MediaSize.Other;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class LibrosJDOM {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JDOMException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, JDOMException, IOException {

		SAXBuilder builder = new SAXBuilder();
		Document documentJDOM = builder.build(new FileInputStream(".\\carpeta\\libros.xml"));
		ArrayList<Libro> alLibros = new ArrayList<Libro>();
		Element raiz = documentJDOM.getRootElement();
		List<Element> libros = raiz.getChildren();
		
		for (Element libro : libros) {
			
			Libro otroLibro = new Libro();
			String isbn = libro.getAttribute("isbn").getValue();
			otroLibro.setIsbn(isbn);
			List<Element> detalles = libro.getChildren();
			
			for (Element detalle : detalles) {
				
				switch (detalle.getName()) {
					
					case "titulo": otroLibro.setTitulo(detalle.getValue());
					break;
					case "autor": otroLibro.setAutor(detalle.getValue());
					break;
					case "anyo": otroLibro.setAnyo(detalle.getValue());
					break;
					case "editorial": otroLibro.setEditorial(detalle.getValue());
					break;
				}
			}
			alLibros.add(otroLibro);
		}
		
		Collections.sort(alLibros, new OrdenarPorTítuloComparator());

		Element eRaiz = new Element("libros");
		Document docJDOM = new Document(eRaiz);
		
		for (int i=0; i<alLibros.size();i++) {
			
			Libro libro = alLibros.get(i);
			Element eLibro = TransformarLibroAElemento(libro);
			eRaiz.addContent(eLibro);			
		}
		
		Element numLibros = new Element("total");
		numLibros.addContent("Hay " + alLibros.size() + " libros");
		eRaiz.addContent(numLibros);
		
	    Format format = Format.getPrettyFormat();
	    XMLOutputter xmloutputter = new XMLOutputter(format);
	    String docStr = xmloutputter.outputString(docJDOM); 
	    FileWriter fw = new FileWriter(".\\carpeta\\arrayLibroOrdenadoPorTítulo.xml");
	    fw.write(docStr);
	    fw.close();

	}

	private static Element TransformarLibroAElemento(Libro libro) {

		Element eLibro = new Element("libro");
		Element eTitulo = new Element("titulo");
		Element eAutor = new Element("autor");
		Element eAnyo = new Element("anyo");
		Element eEditorial = new Element("editorial");
		eTitulo.addContent(libro.getTitulo());
		eAutor.addContent(libro.getAutor());
		eAnyo.addContent(libro.getAnyo());
		eEditorial.addContent(libro.getEditorial());
		eLibro.setAttribute("isbn", libro.getIsbn());
		eLibro.addContent(eTitulo);
		eLibro.addContent(eAutor);
		eLibro.addContent(eAnyo);
		eLibro.addContent(eEditorial);

		return eLibro;
	}

}
