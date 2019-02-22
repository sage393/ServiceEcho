package com.sam.autentica.ws.servidor;

public class Echo {
	public String saludar(String nombre) {
		return String.format("Hola %s", nombre);
	}
	
	public String despedir(String nombre) {
		return String.format("Adios %s", nombre);
	}
}
