package com.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
do{ 
	escribirMenu();
	pedirOpcion();
	int opcion = leerEntero();
	if (opcion == 0) {
		break;
	} else if (opcion == 1) {
		primerOperando();
		int op1 = leerEntero();
		segundoOperando();
		int op2 = leerEntero();
		System.out.println("El resultado de la operación es " +(op1+op2) +".");
		
		
	} else if (opcion == 2) {
		primerOperando();
		int op1 = leerEntero();
		segundoOperando();
		int op2 = leerEntero();
		System.out.println("El resultado de la operación es " +(op1-op2) +".");
		
	} else if (opcion == 3) {
		primerOperando();
		int op1 = leerEntero();
		segundoOperando();
		int op2 = leerEntero();
		System.out.println("El resultado de la operación es " +(op1*op2) +".");
		
		
	} else if (opcion == 4) {
		primerOperando();
		int op1 = leerEntero();
		segundoOperando();
		int op2 = leerEntero();
		System.out.println("El resultado de la operación es " +(op1/op2) +".");
		
		
	} else {
		System.out.println("No es una opción válida");
	}
} while (1 == 1);

	}

	private static void segundoOperando() {
System.out.print("Introduzca el segundo operando: ");		
	}

	private static void primerOperando() {
		System.out.print("Introduzca el primer operando: ");
		
	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
System.out.print("Escoja una opción: ");		
	}

	private static void escribirMenu() {
		System.out.println("CALCULADORA  \r\n"
				+ "  1. Suma  \r\n"
				+ "  2. Resta  \r\n"
				+ "  3. Producto \r\n"
				+ "  4. División  \r\n"
				+ "  0. Salir ");
		
	}

}
