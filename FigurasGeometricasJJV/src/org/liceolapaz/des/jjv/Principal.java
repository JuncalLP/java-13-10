package org.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int b = 0;
		int h = 0;
do {
	escribirMenu();
	pedirOpcion();
	int opcion = leerEntero();
	if (opcion == 0) {
		break;
	} if (opcion == 1) {
		do {System.out.println("Introduce el valor de la base del tri�ngulo: ");
		b = leerEntero();
		if (b > 0) {
		System.out.println("Introduce el valor de la altura del tri�ngulo: ");
		h = leerEntero();
		if (h > 0) {
		System.out.println("El �rea es " +((b*h)/2) +" y el per�metro es de " +(3*b) +".");
		break;
		} else {
			System.out.println("Introduce un valor positivo.");
		}
		} else {
			System.out.println("Introduce un valor positivo.");
		}
		} while (1 ==1);
	} if (opcion == 2) {
		do {
			System.out.println("Introduce el valor de la base del rect�ngulo: ");
			b = leerEntero();
			if (b > 0) {
				System.out.println("Introduce el valor de la altura del rect�ngulo: ");
				h = leerEntero();
				if ( h > 0) {
					System.out.println("El �rea es de" +(b*h) +" y el per�metro es de " +(2*b+2*h) +".");
					break;
				} else {
					System.out.println("Introduce un valor positivo.");
				}
			} else {
				System.out.println("Introduce un valor positivo.");
			}
		} while (1 ==1);
	} if (opcion == 3) {
		do {
			System.out.println("Introduce el valor del lado del cuadrado: ");
			b = leerEntero();
			if (b > 0) {
				System.out.println("El �rea es de" +((b*b)) +" y el per�metro es de " +(4*b) +".");
				break;
			} else {
				System.out.println("Introduce un valor positivo.");
			}
		} while (1 ==1);
	} if (opcion == 4) {
		do {
			System.out.println("Introduce el valor del lado del pent�gono: ");
			b = leerEntero();
			if (b > 0) {
				System.out.println("Introduce el valor de la apotema: ");
				h = leerEntero();
				if (h > 0) {
					System.out.println("El �rea es " +((b*h)/2) +" y el per�metro es de " +(5*b) +".");
					break;
				} else {
				System.out.println("Introduce un valor positivo.");
				}
			} else {
				System.out.println("Introduce un valor positivo.");
			}
		} while (1 == 1);
	} else  if (0 > opcion || opcion > 4) {
		System.out.println("No es una opci�n v�lida");
	} else {
		
	}
} while (1 == 1);

	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opci�n: ");
		
		}

	private static void escribirMenu() {
System.out.println("FIGURAS GEOM�TRICAS  \r\n"
		+ "  1. Tri�ngulo  \r\n"
		+ "  2. Rect�ngulo  \r\n"
		+ "  3. Cuadrado  \r\n"
		+ "  4. Pent�gono  \r\n"
		+ "  0. Salir ");		
	}

}
