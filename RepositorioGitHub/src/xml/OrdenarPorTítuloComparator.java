package xml;

import java.util.Comparator;


public class OrdenarPorTítuloComparator implements Comparator<Libro> {
	
	public int compare(Libro l1, Libro l2) {
		
		return l1.getTitulo().compareTo(l2.getTitulo());
	}

}
