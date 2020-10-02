package com.patrones;

public class Simulador {
	private SistemaEconomico sistemaEconomico;

	public Simulador() {
		this.sistemaEconomico = new SistemaEconomico();
	}

	public void crearEmpresas() {
		Empresa emp1 = new Empresa(null, 1111, 1000, "public");
		// una empresa debe tener minimo 1 empleado
		Persona per1 = new Persona(emp1, 1, 10, "Alberto");

		this.sistemaEconomico.crearEnteEconomico(emp1);
		this.sistemaEconomico.crearEnteEconomico(per1);

		Empresa emp2 = new Empresa(null, 1112, 2000, "private");
		// una empresa debe tener minimo 1 empleado
		Persona per2 = new Persona(emp2, 2, 20, "Camila");
		Persona per3 = new Persona(emp2, 3, 30, "Diana");

		this.sistemaEconomico.crearEnteEconomico(emp2);
		this.sistemaEconomico.crearEnteEconomico(per2);
		this.sistemaEconomico.crearEnteEconomico(per3);
	}

	public void print() {
		Iterador iterador = this.sistemaEconomico.crearIterador();
		System.out.println("-------SIMULADOR------------");
		int j = 1;
		while (iterador.tieneSiguiente()) {
			EnteEconomico ee = (EnteEconomico) iterador.siguiente();
			System.out.println(String.format("--- Ente %d ---", j));
			System.out.println("Identificador: " + ee.getIdentificador());
			System.out.println("Patrimonio: " + ee.getPatrimonio());
			if(ee instanceof Persona){
				System.out.println("tipo: Persona ");
				System.out.println("Nombre: " + ((Persona)ee).getNombre());
			}
			if(ee instanceof Empresa){
				System.out.println("tipo: Empresa ");
				System.out.println("Razon social: " + ((Empresa) ee).getRazonSocial());				
			}
			j += 1;		
			System.out.println("\n");
		}
	}
}
