package com.dam1d.ejer_junit_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiClaseTest {

	@Test
	void testEncripta() {
		MiClase paraProbar=new MiClase("Mi mamá");
		String resultadoObtenido=paraProbar.encripta();
		String resultadoEsperado="Qm$qeqå";
		assertEquals(resultadoEsperado, resultadoObtenido,"falla encriptación");
	}

}
