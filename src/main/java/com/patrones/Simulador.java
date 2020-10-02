package com.patrones;

public class Simulador {
	private ColeccionIterable sistemaEconomico; 
	  
    public Simulador(ColeccionIterable sistemaEconomico) 
    { 
        this.sistemaEconomico = sistemaEconomico; 
    } 
  
    public void print() 
    { 
        Iterador iterador = this.sistemaEconomico.crearIterador(); 
        System.out.println("-------SIMULADOR------------"); 
        while (iterador.tieneSiguiente()) 
        { 
            SistemaEconomico se = (SistemaEconomico)iterador.siguiente(); 
            System.out.println("Persona: " + se.getPersona().getName() + " | " + "Empresa: " + se.getEmpresa().getNit()); 
        } 
    } 
}
