package org.foobarspam.tests;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.tarifa.Tarifa;
import org.junit.Test;

public class TarifaTest {
	
	@Test
	public void getCosteTotalEsperadoTest() {
		double distancia = 1;
		double tiempo = 2;
		double esperado = 5;
		
		double costeEsperado = Tarifa.getCosteTotalEsperado(distancia, tiempo);
		
		assertEquals(esperado, costeEsperado, 0.01);
	}
}
