package repaso;

import java.util.ArrayList;

import ejemplos_basicos.PedirDatos;

public class MainArrayListPersonas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> alp = new ArrayList<Persona>();
		Persona p = null;
		for (int i=0; i <3; i++) {
			p = new Persona(PedirDatos.pedirNombre(), PedirDatos.pedirEdad());
			alp.add(p);
		}
		for(Persona pers : alp) {
			System.out.println(pers);
		}
		p = new Persona("juan", 32);
		alp.remove(p);
		System.out.println(alp);

	}

}
