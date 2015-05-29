package ejemplos_basicos;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class TestPersona {

	@Test
	public void testPersona() {
		
		assertNotNull(new Persona());
		assertNotNull(new Persona("Gigi", 30));
	}

	/*@Test
	public void testPersonaStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetS_nombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetS_nombre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetI_edad() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetI_edad() {
		fail("Not yet implemented");
	}

	@Test
	public void testIncrementoEdad() {
		fail("Not yet implemented");
	}

	@Test
	public void testIncrementoEdad2() {
		fail("Not yet implemented");
	}

	@Test
	public void testIncrementoEdad3() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsMayorDeEdad() {
		fail("Not yet implemented");
	}

	@Test
	public void testMostrarPersona() {
		fail("Not yet implemented");
	}

	@Test
	public void testContaPersonas() {
		
	}
*/
	@Test
	public void testEqualsObject() {
		
		Persona p1 = new Persona("Gigi", 30);
		Persona p2 = new Persona("Gigi", 30);
		assertTrue(p1.equals(p2));
	}

	/*@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testToStringObject() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testCompareTo() {
		
		Persona p1 = new Persona("Gigi", 30);
		Persona p2 = new Persona("Gigi", 30);
		assertSame(0, p1.compareTo(p2));
	}

}
