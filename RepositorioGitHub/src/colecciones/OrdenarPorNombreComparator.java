package colecciones;

import java.util.Comparator;

import ejemplos_basicos.Persona;

public class OrdenarPorNombreComparator implements Comparator<Persona>{

	public int compare(Persona p1, Persona p2) {
		
		return p1.getS_nombre().compareTo(p2.getS_nombre());
		
	}

}
