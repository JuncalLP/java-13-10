package com.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {
	private static final int anhoActual = 2021; 

	public static void main(String[] args) {
		// Pedir año de nacimiento
		pedirAnho();
		// Leer y almacenar
		int anho = leerAnho(); 
		// Escribir mensaje 
escribirMensaje(anho);
	}

	private static void escribirMensaje(int anho) {
// Crear una variable para almacenar el mensaje
		String mensaje = ""; 
		// Comprobar y almacenar mensaje en la variable 
		if (anho > anhoActual) {
			mensaje = "Saludos, viajero.";
		} else if (anhoActual - anho > 150) {
			mensaje = "Tremendo vejestorio.";
		} else if (anhoActual - anho >= 18) {
			mensaje = "Puedes pasar.";
		} else {  
			mensaje = "No puedes pasar.";
		}
		// Escribir mensaje por pantalla 
		System.out.println(mensaje);
	
	}

	private static int leerAnho() {
Scanner escaner = new Scanner(System.in);	
return escaner.nextInt();
	}

	private static void pedirAnho() {
System.out.print("Escribe tu año de nacimiento: ");		
	}

}
