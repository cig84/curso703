package repaso;

import repaso.ListaPersonas;

public class InsertarPersonaException extends Exception{
	
	public static final String mensaje = "Numero de personas excecido. Máximo " + ListaPersonas.CAPACIDAD + " personas";
	

}
