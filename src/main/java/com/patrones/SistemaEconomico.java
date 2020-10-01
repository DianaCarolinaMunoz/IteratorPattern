package com.patrones;

public class SistemaEconomico implements ColeccionIterable {
	
	private static final int MAX_ITEMS = 10; 
	private int cantidadItems = 0;
	private Persona[] listaPersonas;

	public SistemaEconomico() {
		super();
		this.listaPersonas = new Persona[MAX_ITEMS];
		
		this.agregar("Persona 1", 0);
		this.agregar("Persona 2", 0);
		this.agregar("Persona 3", 0);
		this.agregar("Persona 4", 0);
	}

	public Iterador crearIterador() {
		return new IteradorConcreto(this.listaPersonas);
	}

	public void agregar(String name, float patrimonio) {
		Persona personaNueva = new Persona(name, patrimonio);
        if (this.cantidadItems >= MAX_ITEMS) 
            System.err.println("No hay espacio"); 
        else
        { 
            this.listaPersonas[this.cantidadItems] = personaNueva; 
            this.cantidadItems += 1; 
        }
	}


}
