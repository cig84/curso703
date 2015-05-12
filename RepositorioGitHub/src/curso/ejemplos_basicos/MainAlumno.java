package curso.ejemplos_basicos;

public class MainAlumno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Alumno a = null;
		Persona p = null;
		
		p = new Alumno("Juan", (byte) 23, (byte) 10);
		a = new Alumno("Francesco", (byte) 30, (byte) 8);
		
		System.out.println(p.toString());
		System.out.println(a.toString());

	}

}
