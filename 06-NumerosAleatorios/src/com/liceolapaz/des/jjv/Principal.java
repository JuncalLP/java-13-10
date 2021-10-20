package com.liceolapaz.des.jjv;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
// Pedimos al usuario el número a buscar
		pedirNumeroBuscar();
		// Pedimos el número a buscar y lo almacenamos
		int numeroBuscar = leerEntero();
		// Pedimos el número máximo de intentos 
		pedirMaximoIntentos();
		// Almacenar máximo de intentos
		int numeroIntentos = 0; 
		// Leemos el número máximo de intentos y lo almacenamos
		int maximoIntentos = leerEntero();
		while (numeroIntentos < maximoIntentos) {
		// Generar número aleatorio 
		int numeroAleatorio = generarNumeroAleatorio(1, 10);
		// Imprimir número generado
		System.out.println("El número generado fue: " + numeroAleatorio);
		// Sumar 1 a los intentos
		numeroIntentos++;
		// Comprobar si el número generado es igual al que se busca
		comprobarNumero(numeroBuscar, numeroAleatorio, numeroIntentos, maximoIntentos); 
		// Si encotramos el número salir del bucle 
		if (numeroAleatorio == numeroBuscar) {
			break; 
		}
		}
	}
	
	
	private static void comprobarNumero(int numeroBuscar, int numeroAleatorio, int numeroIntentos, int maximoIntentos) {
		// Si lo es, imprimir mensaje.
		if (numeroBuscar == numeroAleatorio) {
			System.out.println("Número encontrado en " + numeroIntentos +" intento(s)");
		}
		// Si no lo es y hay más intentos, repetir
		else if (numeroIntentos < maximoIntentos) {
			
		}
		// Si no lo es y no hay más intentos, imprimir mensaje. 
		else 
			System.out.println("No se ha podido encontrar el número en " + maximoIntentos +"intento(s)");
	}

	private static int generarNumeroAleatorio(int min, int max) {
	Random random = new Random();
	return random.nextInt(max - min) + min;
	}

	private static void pedirMaximoIntentos() {
	System.out.print("Escriba el número máximo de intentos: ");
   
	}

	private static int leerEntero() {
Scanner escaner = new Scanner(System.in);
return escaner.nextInt();
	}

	private static void pedirNumeroBuscar() {
System.out.print("Escriba el número a buscar (entre 1 y 10): ");		
	}

}
