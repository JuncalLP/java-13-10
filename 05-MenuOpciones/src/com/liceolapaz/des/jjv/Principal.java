package com.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Escribir men�
		escribirMenu();
		// Pedir opci�n
		pedirOpcion();
		// Leer opci�n y almacenarla
		int opcion = leerOpcion();
		// Escribir mensaje por pantalla
		escribirMensaje(opcion);
	}

	private static void escribirMensaje(int opcion) {
		// Crear variable para almacenar el mensaje
		String mensaje = "";
		/* Darle valor a la variable mensaje en 
		   funci�n de la opci�n escogida */
		switch (opcion) {
		case 0:
			System.exit(0);
			break;
			
		case 1:
			mensaje = "Opci�n 1 elegida";
			break;
			
		case 2:
			mensaje = "Opci�n 2 elegida";
			break;
			
		case 3:
			mensaje = "Opci�n 3 elegida";
			break;

		default:
			mensaje = "Opci�n no v�lida";
			break;
		}
		// Escribir mensaje por pantalla
		System.out.println(mensaje);
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opci�n: ");
	}

	private static void escribirMenu() {
		System.out.println("MEN� PRINCIPAL\n"
				+ "1. Opci�n 1\n"
				+ "2. Opci�n 2\n"
				+ "3. Opci�n 3\n"
				+ "0. Salir");
	}

}
