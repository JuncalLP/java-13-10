package com.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		do {

			escribirMenu();
			pedirOpcion();
			int opcion = leerEntero();
			if (opcion == 0) {
			break;
			} else if (opcion == 1) {
				pedirCantidad();
				int cantidad = leerEntero();
				System.out.println("La cantidad en euros es " +(cantidad*1.16) +"€");
				
			} else if (opcion == 2) {
				pedirCantidad();
				int cantidad = leerEntero();
				System.out.println("La cantidad en euros es " +(cantidad*0.84) +"€");
				
			} else if (opcion == 3) {
				pedirCantidad();
				int cantidad = leerEntero();
				System.out.println("La cantidad en euros es " +(cantidad*133.33) +"€");
				
			} else {
				System.out.println("No es una opción válida.");
			}

		} while (1 == 1);
	}

	private static void pedirCantidad() {
System.out.print("Escriba la cantidad: ");		
	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
System.out.println("Escoja una opción: ");		
	}

	private static void escribirMenu() {
	System.out.println("CONVERSOR DE MONEDAS  \r\n"
			+ " 1. Dólares  \r\n"
			+ " 2. Libras  \r\n"
			+ " 3. Yens \r\n"
			+ " 0. Salir ");
		
	}

}
