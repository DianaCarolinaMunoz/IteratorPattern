package com.patrones;

public class EnteEconomico implements Contract {
	
	private String name;
	private float patrimonio;

	public EnteEconomico(String name, float patrimonio) {
		super();
		this.name = name;
		this.patrimonio = patrimonio;
	}

	public void contratar(Object ente, int costo, int tiempo) {
		// TODO Auto-generated method stub
		
	}

	public void disolver(Object ente, int penalizacion) {
		// TODO Auto-generated method stub
		
	}

	public void pagar(Object ente) {
		// TODO Auto-generated method stub
		
	}

}
