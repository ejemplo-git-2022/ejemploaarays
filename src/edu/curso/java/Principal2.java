package edu.curso.java;

import java.util.*;

public class Principal2 {

	public static void main(String[] args) {

		HashMap<Integer, String> nombresPorDNI = new HashMap<Integer, String>();
		nombresPorDNI.put(3943342, "Juan Perez");
		nombresPorDNI.put(6534535, "Lucas Orlando");
		nombresPorDNI.put(4563423, "Claudio Perez");
	
		String nombreCompleto = nombresPorDNI.get(6534535);
		System.out.println(nombreCompleto);
		
		System.out.println("**********************************");
		
		HashMap<Integer, Persona> personasPorDNI = new HashMap<Integer, Persona>();
		personasPorDNI.put(3943342, new Persona(1232L, "Juan", "Perez"));
		personasPorDNI.put(6534535, new Persona(432423L, "Lucas", "Orlando"));
		personasPorDNI.put(4563423, new Persona(543345L, "Claudio", "Perez"));

		Persona personaRecuperada = personasPorDNI.get(6534535);
		System.out.println(personaRecuperada);
		
	}

}
