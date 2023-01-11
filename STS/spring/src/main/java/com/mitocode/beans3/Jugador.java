package com.mitocode.beans3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mitocode.interfaces.IEquipo;

@Component
public class Jugador {
	//Usado para ejercicio Tutorial 22 Ejercicio XML
	
	private int id;
	private String nombre;
	@Autowired
	@Qualifier("barcelona")
	//Autowired se usa para vincular cualquier byType que se ajuste al IEquipo, como hay dos se soluciona con
	//Qualifier para especificar cual se desea por defecto
	private IEquipo equipo;
	@Autowired
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
	public IEquipo getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	public Camiseta getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	
}
 