package curso.ejemplos_basicos;

import java.io.Serializable;

public class Persona implements Serializable {

	static final byte MAYOR_EDAD = 18;
	String s_nombre;
	int i_edad;
	static int i_contador;

	/**
	 * Constructor de la clase persona que recibe los parametros
	 * 
	 * @param s_nombre
	 *            indica el nombre de la nueva persona p
	 * @param b_edad
	 *            indica la edad de la nueva persona p
	 */
	public Persona(String s_nombre, int edad) {

		this.s_nombre = s_nombre;
		this.i_edad = edad; /*
							 * this se utiliza para referirme al objeto dentro
							 * del constructor
							 */
	}
	
	public String getS_nombre() {
		return s_nombre;
	}

	public void setS_nombre(String s_nombre) {
		this.s_nombre = s_nombre;
	}

	public int getI_edad() {
		return i_edad;
	}

	public void setI_edad(int i_edad) {
		this.i_edad = i_edad;
	}

	public static Persona incrementoEdad(Persona p, int inc) {
		
		Persona p2 = new Persona(p.s_nombre, p.i_edad + inc);
		return (p2);
	}
	
	public void incrementoEdad2(int inc) {
		
		this.i_edad = (this.i_edad + inc);
	}
	
	public static void incrementoEdad3(Persona p, int inc) { // caso por referencia
		
		p.setI_edad(p.getI_edad() + inc);
	}
	
	/**
	 * Me devuelve 'true' si la persona tiene 18 años o más, 'false' si tiene menos
	 * 
	 * @return
	 */
	public boolean esMayorDeEdad() {		
									
		return (this.i_edad>=MAYOR_EDAD); // para no utilizar 'if-else' con un boolean
	}

	public void mostrarPersona() { /*
									 * no se pasa ningun parametro porque se
									 * muestran los atributos del mismo objecto
									 * que se quiere mostrar utilizando 'this'
									 */
		System.out.println(this.s_nombre + " tiene " + this.i_edad + " años ");
	}
	
	public static void contaPersonas(){
		i_contador++;
	}
	
	@Override	// sobrescrivimos el método 'equals' de la clase padre Object
	public boolean equals(Object obj) {

		boolean iguales; /* siempre como primera instrución definimos 
						  * una variable del tipo que devuelvo y ponemos
						  * solo un return como instrución final
						  */
		Persona p = null;
		if (obj instanceof Persona) {	// si obj es una instancia de la clase Persona
			p = (Persona) obj; 			// casting del objeto obj en un objeto Persona	
		}
		return ((p.s_nombre.equals(this.s_nombre)) && (p.i_edad == this.i_edad)); 
				// comparamos los atributos entre los dos objetos
	}
	
	@Override
	public String toString() {
		
		return (this.s_nombre + " " + this.i_edad);
	}
	
	public String toStringObject() {
		
		String sup = super.toString();
		return sup;
	}
}
