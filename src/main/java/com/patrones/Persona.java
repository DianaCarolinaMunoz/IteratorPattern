package com.patrones;

public class Persona {
	private String name;
	private float patrimonio;
	

	public Persona(String name, float patrimonio) {
		this.name = name;
		this.patrimonio = patrimonio;
	}
	
	
	public void renunciar(){

    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPatrimonio() {
		return patrimonio;
	}


	public void setPatrimonio(float patrimonio) {
		this.patrimonio = patrimonio;
	}

}
