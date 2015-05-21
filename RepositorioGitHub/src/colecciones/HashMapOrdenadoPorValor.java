package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ejemplos_basicos.PedirDatos;
import ejemplos_basicos.Persona;

public class HashMapOrdenadoPorValor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Persona> hashMap = new HashMap<String, Persona>();
		Map<String, Persona> lhashMap = new LinkedHashMap<String, Persona>();
		Persona p1 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		Persona p2 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		Persona p3 = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
		hashMap.put(p1.getS_nombre(), p1);
		hashMap.put(p2.getS_nombre(), p2);
		hashMap.put(p3.getS_nombre(), p3);
		lhashMap = ordenarPorValor(hashMap);
		System.out.println(lhashMap);

	}
	
	public static LinkedHashMap<String, Persona> ordenarPorValor (HashMap<String, Persona> h) {
		
		LinkedHashMap<String, Persona> lhm = new LinkedHashMap<String, Persona>();
		Persona p_aux = null;
		
		ArrayList<Persona> alValores = new ArrayList<Persona>();
		ArrayList<String> alClaves = new ArrayList<String>();
		
		alValores.addAll(h.values());
		alClaves.addAll(h.keySet());
		
		Set<Persona> ts = new TreeSet<Persona>();
		ts.addAll(h.values());
		
		Iterator<Persona> it = ts.iterator();
		
		while (it.hasNext()) {
			p_aux = it.next();
			lhm.put(alClaves.get(alValores.indexOf(p_aux)), p_aux);
			
		}
		
		return lhm;
		
	}

}
