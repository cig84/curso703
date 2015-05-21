package colecciones;

import java.util.Set;
import java.util.TreeSet;

import ejemplos_basicos.PedirDatos;
import ejemplos_basicos.Persona;

public class MainCompareToTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p1 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		Persona p2 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		Persona p3 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		Set<Persona> m = new TreeSet<Persona>();
		m.add(p1); // Cada vez que se inserta un objeto Persona en el TreeSet
		m.add(p2); // llama al método compareTo de Persona 
		m.add(p3); // que sobreescribe el de la Interfaz Comparable
		System.out.println(m);

	}

}
