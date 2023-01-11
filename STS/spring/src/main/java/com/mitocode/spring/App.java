package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Jugador;
import com.mitocode.beans.Persona;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		Persona per2 = (Persona) appContext.getBean("persona");
		
		String nombreCiudades = "";
		for (Ciudad ciu : per.getPais().getCiudades()) {
			nombreCiudades += ciu.getNombre() + "-";
		}
		
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre() + " " + nombreCiudades);
		
		//Si el scope en beans.xml del bean persona es singleton, se crea una instancia del mismo objeto, 
		//pero si es prototype se crean dos objetos con los mismos datos
		System.out.println(per);
		System.out.println(per2);
		
		((ConfigurableApplicationContext) appContext).close(); //cerrar el bean
		
		//--------------------------------------------
		//Ejercicio 2, implementacion Messi, beans1b.xml
		
		ApplicationContext appContext2 = new ClassPathXmlApplicationContext("com/mitocode/xml/beans1b.xml");
		Jugador jug = (Jugador) appContext2.getBean("messi");
		System.out.println(jug.getNombre() + " "+ jug.getNumero() + " " + jug.getEquipo().mostrar());
		
		((ConfigurableApplicationContext) appContext2).close(); //cerrar el bean
		
		
	}

}