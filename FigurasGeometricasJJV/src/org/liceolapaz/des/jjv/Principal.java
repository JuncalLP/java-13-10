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
		do {System.out.println("Introduce el valor de la base del triángulo: ");
		b = leerEntero();
		if (b > 0) {
		System.out.println("Introduce el valor de la altura del triángulo: ");
		h = leerEntero();
		if (h > 0) {
		System.out.println("El área es " +((b*h)/2) +" y el perímetro es de " +(3*b) +".");
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
			System.out.println("Introduce el valor de la base del rectángulo: ");
			b = leerEntero();
			if (b > 0) {
				System.out.println("Introduce el valor de la altura del rectángulo: ");
				h = leerEntero();
				if ( h > 0) {
					System.out.println("El área es de" +(b*h) +" y el perímetro es de " +(2*b+2*h) +".");
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
				System.out.println("El área es de" +((b*b)) +" y el perímetro es de " +(4*b) +".");
				break;
			} else {
				System.out.println("Introduce un valor positivo.");
			}
		} while (1 ==1);
	} if (opcion == 4) {
		do {
			System.out.println("Introduce el valor del lado del pentágono: ");
			b = leerEntero();
			if (b > 0) {
				System.out.println("Introduce el valor de la apotema: ");
				h = leerEntero();
				if (h > 0) {
					System.out.println("El área es " +((b*h)/2) +" y el perímetro es de " +(5*b) +".");
					break;
				} else {
				System.out.println("Introduce un valor positivo.");
				}
			} else {
				System.out.println("Introduce un valor positivo.");
			}
		} while (1 == 1);
	} else  if (0 > opcion || opcion > 4) {
		System.out.println("No es una opción válida");
	} else {
		
	}
} while (1 == 1);

	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
		
		}

	private static void escribirMenu() {
System.out.println("FIGURAS GEOMÉTRICAS  \r\n"
		+ "  1. Triángulo  \r\n"
		+ "  2. Rectángulo  \r\n"
		+ "  3. Cuadrado  \r\n"
		+ "  4. Pentágono  \r\n"
		+ "  0. Salir ");		
	}

}
