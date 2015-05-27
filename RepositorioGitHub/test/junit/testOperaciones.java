package junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class testOperaciones {
	
	static Operaciones op;
	
	@BeforeClass
	public static void iniciaClase() {
		
		op = new Operaciones();
	}
	
	@AfterClass
	public static void finClase() {
		
		op = null;
	}

	@Test
	public void testSuma() {
		assertEquals("5 MAS 3 = 8", 8, op.suma(5, 3));
		
	}

	@Test
	public void testMultiplicacion() {
		assertEquals("5 POR 3 = 15", 15, op.multiplicacion(5, 3));
	}

	@Test
	public void testDivision() {
		assertEquals("5 DIV 3 = 1", 1, op.division(5, 3));
	}

	@Test
	public void testResta() {
		assertEquals("5 MENOS 3 = 2", 2, op.resta(5, 3));
	}

}
