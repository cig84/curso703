package colecciones;

import java.util.Comparator;

import ejemplos_basicos.Persona;

public class OrdenarPorEdadComparator implements Comparator<Persona>{

	public int compare(Persona p1, Persona p2) {
		
		return p1.getI_edad()-p2.getI_edad();
		
	}

}
