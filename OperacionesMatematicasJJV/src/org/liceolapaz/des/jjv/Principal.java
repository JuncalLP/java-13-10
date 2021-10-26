package org.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
do {
	escribirMenu();
	pedirOpcion();
	int opcion = leerEntero();
	if (opcion == 3) {
		break;
	} else if (opcion == 1) {
		System.out.print("Intoduce el valor de la base:");
		double a = leerEntero();
		System.out.print("Introduce el valor del exponente: ");
		double b = leerEntero();
		double resultado = Math.pow(a,b);
		System.out.println("El resultado es " +resultado);
		
	} else if (opcion == 2) {
System.out.print("Introduzca el operando: ");
	double a = leerEntero();
	double resultado = Math.sqrt(a);
	System.out.println("El resultado es " +resultado);
	}
	else if (opcion < 1 || opcion > 3){
		System.out.println("No es una opción válida.");
	} else {
		
	}
} while (1 ==1);

	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
		}

	private static void escribirMenu() {
System.out.println("POTENCIAS Y RAICES CUADRADAS \r\n"
		+"\r\n"
		+ "1. Potencia \r\n"
		+"\r\n"
		+ "2. Raíz cuadrada \r\n"
		+"\r\n"
		+ "3. Salir "
		+"\r\n");
		
	}

}
