package com.dam1d.ejer_junit_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiClase2Test {

	@Test
	void testDesencripta() {
		MiClase2 paraProbar=new MiClase2("Qm$qeqå");
		String resultadoObtenido=paraProbar.desencripta();
		String resultadoEsperado="Mi mamá";
		assertEquals(resultadoEsperado, resultadoObtenido,"falla desencriptación");
	}

}
