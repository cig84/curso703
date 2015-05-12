package curso.ejemplos_basicos;

public class PersonaNull {
	
	public static void main(String[] args) {
		
		Persona p = null;
		
		if (p instanceof Persona) {
			
			System.out.println("Es una persona");
			
		} else System.out.println("No es una persona");
			
	}

}
