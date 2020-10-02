package com.patrones;

public class Persona extends EnteEconomico {

	private String nombre;

	public Persona(EnteEconomico empresa, int identificador, float patrimonio, String nombre) {
		super(empresa, identificador, patrimonio);
		this.nombre = nombre;
	}

	public void renunciar() {

	}

	@Override
	public int getIdentificador() {
		return super.getIdentificador();
	}

	@Override
	public float getPatrimonio() {
		return super.getPatrimonio();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
