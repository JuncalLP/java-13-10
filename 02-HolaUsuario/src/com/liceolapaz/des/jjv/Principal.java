package com.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir nombre usuario
		pedirNombre();
		// Recibir nombre y almacenar
		String nombreUsuario = recibirNombre(); 
		// Nombre a pantalla 
		escribirSaludo(nombreUsuario);
	}

	private static void escribirSaludo(String nombreUsuario) {
System.out.println("Saludos, " + nombreUsuario + ".");		
	}

	private static String recibirNombre() {
	Scanner escaner = new Scanner(System.in);
		return escaner.nextLine();	
	}

	private static void pedirNombre() {
		System.out.print("Escriba su nombre: ");
	}

}
