package com.patrones;

public class EnteEconomico implements Contract {
	
	private int identificador;
	private float patrimonio;
	private EnteEconomico contraEconomico;

	public EnteEconomico(EnteEconomico contraEconomico, int identificador, float patrimonio) {
		super();
		this.contraEconomico = contraEconomico;
		this.identificador = identificador;
		this.patrimonio = patrimonio;
	}

	public void contratar(Object ente, int costo, int tiempo) {
		
	}

	public void disolver(Object ente, int penalizacion) {
		
	}

	public void pagar(Object ente) {
		
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public float getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(float patrimonio) {
		this.patrimonio = patrimonio;
	}

	public EnteEconomico getEnteEconomico() {
		return contraEconomico;
	}

	public void setEnteEconomico(EnteEconomico enteEconomico) {
		this.contraEconomico = enteEconomico;
	}
	
}
