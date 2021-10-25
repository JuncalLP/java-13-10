package org.liceolapaz.des.jjv;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
do{ escribirMenu();
pedirOpcion();
int opcion = leerEntero();
if (opcion == 0) {break;
	} else if (opcion == 1) {
		int numeroIntentos = 3;
				int numeroAleatorio = generarNumero(1,10);
				pedirNumero();
				int numeroUsuario = leerEntero();
				do {
				if (numeroUsuario == numeroAleatorio) {
						System.out.println("Has ganado en " +(4 - numeroIntentos) +" intento(s).");
						break;
					} else if (numeroUsuario > numeroAleatorio) {
						System.out.println("El número a adivinar es menor. Quedan " +--numeroIntentos +" intento(s).");
						if (numeroIntentos == 0) {System.out.println("El número a adivinar era " +numeroAleatorio +".");
							break;
						}
						pedirNumero();
						numeroUsuario = leerEntero();
					} else  if (numeroUsuario < numeroAleatorio) {
						System.out.println("El número a adivinar es mayor. Quedan " +--numeroIntentos +" intento(s).");
						if (numeroIntentos == 0) {System.out.println("El número a adivinar era " +numeroAleatorio +".");
							break;
						}
						pedirNumero();
						numeroUsuario = leerEntero();
					} 
				} while (numeroIntentos > 0);
				
	} else if (opcion == 2) {
		int numeroIntentos = 5;
		int numeroAleatorio = generarNumero(1,50);
		pedirNumero();
		int numeroUsuario = leerEntero();
		do {
		if (numeroUsuario == numeroAleatorio) {
			System.out.println("Has ganado en " +(6 - numeroIntentos) +" intento(s).");
				break;
			} else if (numeroUsuario > numeroAleatorio) {
				System.out.println("El número a adivinar es menor. Quedan " +--numeroIntentos +" intento(s).");
				if (numeroIntentos == 0) {System.out.println("El número a adivinar era " +numeroAleatorio +".");
					break;
				}
				pedirNumero();
				numeroUsuario = leerEntero();
			} else  if (numeroUsuario < numeroAleatorio) {
				System.out.println("El número a adivinar es mayor. Quedan " +--numeroIntentos +" intento(s).");
				if (numeroIntentos == 0) {System.out.println("El número a adivinar era " +numeroAleatorio +".");
					break;
				}
				pedirNumero();
				numeroUsuario = leerEntero();
			} 
		} while (numeroIntentos > 0);
		
		
	} else {
		System.out.println("No es una opción válida.");
		break;
	}
} while (1 == 1);

}

	private static void pedirNumero() {
System.out.print("Intenta adivinar el número: ");
		
	}

	private static int generarNumero(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

	private static void escribirMenu() {
		System.out.println("ADIVINA EL NÚMERO  \r\n"
				+ "  1. Del 1 al 10 (3 intentos)  \r\n"
				+ "  2. Del 1 al 50 (5 intentos)  \r\n"
				+ "  0. Salir ");
		
	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
		
	}
	
	}


