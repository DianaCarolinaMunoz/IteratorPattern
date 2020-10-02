package com.patrones;

public class IteradorConcreto implements Iterador {

	private EnteEconomico[] listaEnteEconomicos;
	private int posicion = 0;

	public IteradorConcreto(EnteEconomico[] listaEnteEconomicos) {
		super();
		this.listaEnteEconomicos = listaEnteEconomicos;
	}

	public Boolean tieneSiguiente() {
		if (posicion >= listaEnteEconomicos.length || listaEnteEconomicos[posicion] == null) {
			return false;
		} else {
			return true;
		}

	}

	public Object siguiente() {
		EnteEconomico sistemaEconomico = listaEnteEconomicos[posicion];
		posicion += 1;
		return sistemaEconomico;
	}

}
