package com.patrones;

public class Persona extends EnteEconomico {
	private String name;
	

	public Persona(String name, float patrimonio) {
		super(name, patrimonio);
	}
	
	
	public void renunciar(){

    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
