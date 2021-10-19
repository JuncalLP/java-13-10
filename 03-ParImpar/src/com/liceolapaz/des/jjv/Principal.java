package com.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Pedir n�mero al usuario
		pedirNumero(); 
		// Leer y guardar n�mero
		int numeroUsuario = leerNumero();
		// Comprobar si es par o impar
		escribirMensaje(numeroUsuario);
	}

	private static void escribirMensaje(int numeroUsuario) {
        // Almacenar el mensaje en una variable
		String mensaje = 
				(numeroUsuario == 0) ?
						"El n�mero 0 no es par ni impar." :
							(numeroUsuario % 2 == 0) ?
				"El n�mero introducido es par." :
					"El n�mero introducido es impar.";
	 // Escribir por pantalla el mensaje
					System.out.println(mensaje);
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in); 
		return escaner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Escriba un n�mero entero: ");
		
	}

}
