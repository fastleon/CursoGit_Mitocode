package com.mitocode.beans;

import java.util.List;

public class Pais {

		private String nombre;
		private List<Ciudad> ciudades;

		public List<Ciudad> getCiudades() {
			return ciudades;
		}

		public void setCiudades(List<Ciudad> ciudad) {
			this.ciudades = ciudad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
}
