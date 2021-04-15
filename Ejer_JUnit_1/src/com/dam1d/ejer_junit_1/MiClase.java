package com.dam1d.ejer_junit_1;

public class MiClase {

	private String palabra;
	private String resultado;
	private char caracter;

	public MiClase(String palabraParaEncriptar) {
		palabra=palabraParaEncriptar;
	}

	public String encripta() {
		resultado="";
		for (int i = 0; i < palabra.length(); i++) {
			caracter = palabra.charAt(i);
			caracter=(char) (caracter+4);
			resultado=resultado+caracter;
		}
		return resultado;
	}

}
