package com.mitocode.beans2;

import com.mitocode.interfaces.IEquipo2;

public class Jugador {
	//Usado para ejercicio Tutorial 22 Ejercicio XML
	
	private int id;
	private String nombre;
	private IEquipo2 equipo;
	private Camiseta camiseta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo2 getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo2 equipo) {
		this.equipo = equipo;
	}
	public Camiseta getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	
}
 