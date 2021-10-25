package com.liceolapaz.des.jjv;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
// Pedir números al usuario
		pedirNumeros();
		// Crear variable para almacenar los números
		int[] numeros = new int[10]; 
		// Leer números
		int contador = 0; 
		do {
			numeros[contador] = leerNumero();
			contador++;
			
		} while(contador < 10);
		// Calcular suma y almacenar en una variable
		int sumaTotal = calcularSuma(numeros);
		// Escribir el resultado
		escribirResultado(sumaTotal);
	}

	private static void escribirResultado(int sumaTotal) {
		// TODO Auto-generated method stub
		
	}

	private static int calcularSuma(int[] numeros) {
		int total = 0;
		for (int i = 0 : i < numeros.length; i++) {
			
		} 
		return total;
	}

	private static void leerNumero() {
Scanner escaner = new Scanner(System.in);
return escaner.nextInt();
	}

	private static void pedirNumeros() {
System.out.println("Escriba");		
	}

}
