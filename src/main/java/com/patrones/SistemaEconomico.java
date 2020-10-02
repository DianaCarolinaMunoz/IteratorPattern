package com.patrones;

public class SistemaEconomico implements ColeccionIterable {
	
	private static final int MAX_ITEMS = 10; 
	private int cantidadItems = 0;
	
	private SistemaEconomico[] listaSistemasE;
	private Empresa empresa;
	private Persona persona;

	public SistemaEconomico(Empresa empresa, Persona persona) {
		super();
		this.empresa = empresa;
		this.persona = persona;
	}

	public SistemaEconomico() {
		super();
		this.listaSistemasE = new SistemaEconomico[MAX_ITEMS];
		
		this.agregar(this.crearEmpresa("12345", "Ninguna"), this.crearPersona("qqq", 1234));
		this.agregar(this.crearEmpresa("2345", "Ninguna"), this.crearPersona("aaa", 1234));
		this.agregar(this.crearEmpresa("5678", "Ninguna"), this.crearPersona("bbb", 1234));
	}

	private Persona crearPersona(String nombre, float patrimonio) {
		return new Persona(nombre, patrimonio);
	}
	
	private Empresa crearEmpresa(String nit, String razonSocial) {
		return new Empresa(nit, razonSocial);
	}
	
	public void agregar(Empresa empresa, Persona persona) {
		
        if (this.cantidadItems >= MAX_ITEMS) 
            System.err.println("No hay espacio"); 
        else
        { 
            this.listaSistemasE[this.cantidadItems] = new SistemaEconomico(empresa, persona); 
            this.cantidadItems += 1; 
        }
	}
	
	public Iterador crearIterador() {
		return new IteradorConcreto(this.listaSistemasE);
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
}
