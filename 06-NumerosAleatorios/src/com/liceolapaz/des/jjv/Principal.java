package com.liceolapaz.des.jjv;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
// Pedimos al usuario el n�mero a buscar
		pedirNumeroBuscar();
		// Pedimos el n�mero a buscar y lo almacenamos
		int numeroBuscar = leerEntero();
		// Pedimos el n�mero m�ximo de intentos 
		pedirMaximoIntentos();
		// Almacenar m�ximo de intentos
		int numeroIntentos = 0; 
		// Leemos el n�mero m�ximo de intentos y lo almacenamos
		int maximoIntentos = leerEntero();
		while (numeroIntentos < maximoIntentos) {
		// Generar n�mero aleatorio 
		int numeroAleatorio = generarNumeroAleatorio(1, 10);
		// Imprimir n�mero generado
		System.out.println("El n�mero generado fue: " + numeroAleatorio);
		// Sumar 1 a los intentos
		numeroIntentos++;
		// Comprobar si el n�mero generado es igual al que se busca
		comprobarNumero(numeroBuscar, numeroAleatorio, numeroIntentos, maximoIntentos); 
		// Si encotramos el n�mero salir del bucle 
		if (numeroAleatorio == numeroBuscar) {
			break; 
		}
		}
	}
	
	
	private static void comprobarNumero(int numeroBuscar, int numeroAleatorio, int numeroIntentos, int maximoIntentos) {
		// Si lo es, imprimir mensaje.
		if (numeroBuscar == numeroAleatorio) {
			System.out.println("N�mero encontrado en " + numeroIntentos +" intento(s)");
		}
		// Si no lo es y hay m�s intentos, repetir
		else if (numeroIntentos < maximoIntentos) {
			
		}
		// Si no lo es y no hay m�s intentos, imprimir mensaje. 
		else 
			System.out.println("No se ha podido encontrar el n�mero en " + maximoIntentos +"intento(s)");
	}

	private static int generarNumeroAleatorio(int min, int max) {
	Random random = new Random();
	return random.nextInt(max - min) + min;
	}

	private static void pedirMaximoIntentos() {
	System.out.print("Escriba el n�mero m�ximo de intentos: ");
   
	}

	private static int leerEntero() {
Scanner escaner = new Scanner(System.in);
return escaner.nextInt();
	}

	private static void pedirNumeroBuscar() {
System.out.print("Escriba el n�mero a buscar (entre 1 y 10): ");		
	}

}
