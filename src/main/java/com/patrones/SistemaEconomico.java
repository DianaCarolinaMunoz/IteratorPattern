package com.patrones;

public class SistemaEconomico implements ColeccionIterable {

	private static final int MAX_ITEMS = 20;
	private int cantItems = 0;

	private EnteEconomico[] listaEntesEconomicos;
	

	public SistemaEconomico() {
		super();
		this.listaEntesEconomicos = new EnteEconomico[MAX_ITEMS];
	}
	
	public void crearEnteEconomico(EnteEconomico ente) {
		if (this.cantItems <= MAX_ITEMS) {
			this.listaEntesEconomicos[this.cantItems] = ente;
			this.cantItems += 1;
		} else {
			System.out.println("Numero maximo de entes economicos excedido");
		}
	}

	public Iterador crearIterador() {
		return new IteradorConcreto(this.listaEntesEconomicos);
	}

}
