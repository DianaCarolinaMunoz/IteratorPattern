package com.patrones;

public class IteradorConcreto implements Iterador {
	
	private SistemaEconomico[] listaSistemasE;
	private int posicion = 0;

	public IteradorConcreto(SistemaEconomico[] listaSistemasE) {
		super();
		this.listaSistemasE = listaSistemasE;
	}

	public Boolean tieneSiguiente() {
		if (posicion >= listaSistemasE.length || 
				listaSistemasE[posicion] == null)
			return false;
		else
			return true;
		
	}
	
	public Object siguiente() {
		SistemaEconomico sistemaEconomico =  listaSistemasE[posicion]; 
		posicion += 1; 
        return sistemaEconomico; 
	}	

}
