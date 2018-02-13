package org.foobarspam.tests;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.conductores.Conductor;
import org.junit.Before;
import org.junit.Test;

public class ConductorTest {

	Conductor conductor;
	@Before
	public void setUp() {
		conductor = new Conductor("Abc");
		
	}
	
	@Test
	public void getValoracionMediaTest() {
		assertEquals(0, conductor.getValoracionMedia(), 0.01);
	}
	
	@Test
	public void setValoracionTest() {
		double val1 = 2, val2 = 4;
		double expected = 3;
		conductor.setValoracion(val1);
		conductor.setValoracion(val2);
		
		assertEquals(expected, conductor.getValoracionMedia(), 0.01);
		
	}

}
