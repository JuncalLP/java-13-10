package com.liceolapaz.des.jjv;

public class Principal {

	public static void main(String[] args) {
// Escribir men� 
		escribirMenu(); 
		// Pedir opcion 
		pedirOpcion();
		// Leer y almacenar opcion
		int opcion = leerOpcion(); 
		// Mostrar mensaje en pantalla 
		escribirMensaje(opcion);
	}

	private static void escribirMensaje(int opcion) {
// Crear variable para almacenar el mensaje
		String mensaje = "";
		//Darle valor a la variable mensaje en funcion de la variable escogida
				switch (opcion) {
				case 0: 
					System.exit(0);
					break;
					
				case 1: 
					mensaje = "Opci�n 1 elegida";
					break;
				
				
				case 2:
					mensaje = "Opci�n 2 elegida"; 
					break;
					
				case 3: 
					mensaje = "Opci�n 2 elegida";
					break;
					
					default: 
						mensaje = "Opci�n no v�lida";
						break;
		// Escribir mensaje por pantalla
	}

	private static int leerOpcion() {
Scanner escaner = new Scanner(System.in); 
return escaner.;
	}

	private static void pedirOpcion() {
System.out.print("Escoja una opci�n ");		
	}

	private static void escribirMenu() {
System.out.println("MEN� PRINCIPAL\n"
		+ "1. Opci�n 1\n"
		+ "2. Opci�n 2\n"
		+ "3. Opci�n 3\n"
		+ "0. Salir");		
	}

}
