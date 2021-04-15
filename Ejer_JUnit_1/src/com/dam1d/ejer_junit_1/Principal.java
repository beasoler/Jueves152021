package com.dam1d.ejer_junit_1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(" Escribe una línea: ");
		String palabra = teclado.nextLine();
		teclado.close();
		MiClase miclase = new MiClase(palabra);
		String encriptada = miclase.encripta();
		System.out.println(" Encriptada: " + encriptada);
		MiClase2 miclase2 = new MiClase2(encriptada);
		String desencriptada = miclase2.desencripta();		
		System.out.println(" Desencriptada: " + desencriptada);
		System.out.println(" Fin del programa");
	}

}
