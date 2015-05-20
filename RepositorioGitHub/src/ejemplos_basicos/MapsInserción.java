package curso.ejemplos_basicos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsInserción {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Marco", 25);
		Persona p2 = new Persona("Alessia", 28);
		Persona p3 = new Persona("Daniele", 22);
		Map<String, Persona> m = new LinkedHashMap<String, Persona>();
		m.put(p1.getS_nombre(), p1);
		m.put(p2.getS_nombre(), p2);
		m.put(p3.getS_nombre(), p3);
		
		Map<Integer, Alumno> t = new TreeMap<Integer, Alumno>();
		Alumno a1 = new Alumno("Marco", 25, 3);
		Persona a2 = new Alumno("Alessia", 28, 5);
		Persona a3 = new Alumno("Daniele", 22, 8);
		t.put(a1.getNota(), a1);
		t.put(((Alumno) a2).getNota(), (Alumno) a2);
		t.put(((Alumno) a3).getNota(), (Alumno) a3);
		
		System.out.println(m);
		System.out.println(t);

	}

}
