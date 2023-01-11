package com.mitocode.beans3;

import org.springframework.stereotype.Component;

import com.mitocode.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{
	
	@Override
	public String mostrar() {
		return "Barcelona Futbol Club";
	}

}
