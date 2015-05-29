package ejemplos_basicos;

import static org.junit.Assert.*;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import repaso.InsertarPersonaException;
import repaso.ListaPersonas;
import repaso.Persona;

public class TestListaPersonas {

	@Test
	public void testListaPersonas() {

		ListaPersonas lp = new ListaPersonas();
		Persona[] array_p = lp.getListaPersonas();
		assertArrayEquals(new Persona[] {null, null, null, null, null, null, null, null, null, null}, array_p);
		for (int i=0; i<ListaPersonas.CAPACIDAD; i++) {
			assertNull(array_p[i]);
			assertThat(array_p[i], IsNull.nullValue());
		}
		for (Persona p : array_p) {
			assertThat(p, IsEqual.equalTo(null));
		}
		
	}
/*
	@Test
	public void testGetListaPersonas() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscarPersonaString() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscarPersonaInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstáRepetido() {
		fail("Not yet implemented");
	}

	@Test
	public void testEliminarPersona() {
		fail("Not yet implemented");
	}

	@Test
	public void testSerializar() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeserializar() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testInsertarPersona() throws InsertarPersonaException {
		
		ListaPersonas lp = new ListaPersonas();
		Persona p = new Persona("Gigi", 30);
		lp.insertarPersona(p);
		assertTrue(lp.numeroPersonas()>0);
		
	}
/*
	@Test
	public void testNumeroPersonas() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaLlena() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaVacia() {
		fail("Not yet implemented");
	}

	@Test
	public void testMostrar() {
		fail("Not yet implemented");
	}
*/
}
