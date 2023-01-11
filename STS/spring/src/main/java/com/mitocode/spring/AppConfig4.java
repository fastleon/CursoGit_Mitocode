package com.mitocode.spring;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

import com.mitocode.beans3.Barcelona;
import com.mitocode.beans3.Camiseta;
import com.mitocode.beans3.Jugador;
import com.mitocode.beans3.Juventus;
import com.mitocode.beans3.Marca;

//Aplicacion con solo codigo Java tutorial 24 MitoCode

@Configuration
public class AppConfig4 {
	
	@Bean
	public Jugador jugador1() {  //En este caso el nombre del metodo es el mismo ID del Bean
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona() {
		return new Barcelona();
	}
	
	@Bean
	public Juventus juventus() {
		return new Juventus();
	}
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean
	public Marca marca() {
		return new Marca();
	}

}
 