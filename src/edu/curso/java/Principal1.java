package edu.curso.java;

public class Principal1 {

	public static void main(String[] args) {

		
		String[] nombres = new String[3];
		nombres[0] = "Juan";
		nombres[1] = "Maria";
		nombres[2] = "Julio";
		
		for (int i = 0; i < nombres.length; i++) {
			String nombreTmp = nombres[i];
			System.out.println("Nombre: " + nombreTmp);
			
		}
		
		System.out.println("****************************************");
		
		for (String nombre : nombres) {
			System.out.println("Nombre: " + nombre);
		}
		
		System.out.println("****************************************");

		Integer[][] numeros = new Integer[3][3];
		numeros[0][0] = 1;
		numeros[0][1] = 4;
				
		System.out.println("****************************************");

		Object[] cosas = new Object[2];
		cosas[0] = "Juan";
		cosas[1] = 102.3;		
		
	}

}
