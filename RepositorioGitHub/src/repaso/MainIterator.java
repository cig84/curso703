package repaso;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		declaro un ArrayList
		ArrayList<Persona> l = new ArrayList<Persona>();
//		creo objeto/s Persona
		Persona p = new Persona("Francesco", 30);
//		añado Personas al ArrayList
		l.add(p);
//		declaro un Iterator de objetos Persona
		Iterator<Persona> ip = l.iterator();
//		recorro
		while (ip.hasNext()) {
			p = ip.next();
			System.out.println(p);
		}

	}

}
