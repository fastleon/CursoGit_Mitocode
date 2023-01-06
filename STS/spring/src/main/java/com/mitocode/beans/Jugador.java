package com.mitocode.beans;

import org.springframework.beans.factory.annotation.Required;

import com.mitocode.interfaces.IEquipo;

public class Jugador {
	private int numero;
	private String nombre;
	
	//Se usa la anotacion Required en el setter para especificar que esa atributo es obligatorio
	
	private IEquipo equipo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	
	
	//Se usa la anotacion Required en el setter para especificar que esa atributo es obligatorio
	@Required
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
}
