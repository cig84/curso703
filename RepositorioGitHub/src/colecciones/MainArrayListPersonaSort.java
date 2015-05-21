package colecciones;

import java.util.ArrayList;
import java.util.Collections;

import ejemplos_basicos.PedirDatos;
import ejemplos_basicos.Persona;

public class MainArrayListPersonaSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Persona> alp = new ArrayList<Persona>();
		Persona p1 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		Persona p2 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		Persona p3 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		alp.add(p1);
		alp.add(p2);
		alp.add(p3);
		Collections.sort(alp, new OrdenarPorNombreComparator());
		System.out.println(alp);
		Collections.sort(alp, new OrdenarPorEdadComparator());
		System.out.println(alp);
		Collections.shuffle(alp);
		System.out.println(alp);

	}

}
