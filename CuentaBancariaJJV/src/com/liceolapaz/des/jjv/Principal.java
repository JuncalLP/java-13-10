package com.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int saldo = 0;
		boolean cuenta = false;
		boolean premium = false;
do {
	escribirMenu();
	pedirOpcion();
	int opcion = leerEntero();
	if (opcion == 0) {
		break;
	} else if (opcion == 1) {
		escribirMenu2();
		pedirOpcion();
		int opcion2 = leerEntero();
		if (opcion2 == 0) {
			
		} else if (opcion2 == 1) {
	do {		System.out.print("Escriba el saldo inicial");
			saldo = leerEntero();
			if (saldo < 0) {
				System.out.println("El saldo inicial debe ser positivo.");
			} else {
				cuenta = true; 
				break;
			}
	} while (1 ==1);
		} else if (opcion2 == 2) {
		do {	System.out.println("Escriba el saldo inicial: ");
			saldo = leerEntero();
			if (saldo < 0) {
				System.out.println("El saldo inicial debe ser positivo.");
			} else {
				cuenta = true;
				premium = true;
				break;
			}
		} while (1 == 1);
		} else { 
			System.out.println("No es una opción válida.");
		}
		
	} else if (opcion == 2) {
		if (cuenta = false) {
			System.out.println("No hay una cuenta activa.");
		} else {
	do {		System.out.print("Escriba la cantidad a ingresar: ");
			int ingreso = leerEntero();
			if (ingreso < 0) {
				System.out.println("La cantidad a ingresar debe ser positiva.");
			} else {
			System.out.println("El nuevo saldo es de " +(saldo+ingreso) +".");
			break;
		} 
		} while (1 ==1);
	
		
	}
	}else if (opcion == 3) {
		do {
			System.out.print("Escriba la cantidad a retirar: ");
			int retirada = leerEntero();
			saldo = saldo-retirada;
			if (retirada < 0) {
				System.out.println("La cantidad a retirar debe ser positiva.");
			} else if (saldo < 0 & premium == true) {
	System.out.println("El nuevo saldo es de " +saldo +".");
	break;
			} else if (saldo < 0 & premium == false) {
				System.out.println("Las cuentas normales no aceptan saldos negativos.");
				saldo = saldo+retirada;
				break;
			}
		} while(1 == 1);
	} else if (opcion == 4) {
		System.out.println("El saldo actual es de " +saldo +".");
	} else {
		System.out.println("No es una opción válida.");
	}
} while (1 == 1);

	}

	private static void escribirMenu2() {
System.out.println("Tipo de cuenta  \r\n"
		+ " 1. Cuenta normal  \r\n"
		+ " 2. Cuenta Premium  \r\n"
		+ " 0. Cancelar ");
		
	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirOpcion() {
System.out.print("Escoja una opción: ");
		
	}

	private static void escribirMenu() {
	System.out.println("BANCO  \r\n"
			+ " 1. Crear cuenta  \r\n"
			+ " 2. Ingresar dinero  \r\n"
			+ " 3. Retirar dinero  \r\n"
			+ " 4. Consultar saldo  \r\n"
			+ " 0. Salir ");
		
	}

}
