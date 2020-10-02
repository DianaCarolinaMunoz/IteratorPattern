package com.patrones;

public class Simulador {
	private ColeccionIterable sistemaEconomico; 
	  
    public Simulador(ColeccionIterable sistemaEconomico) 
    { 
        this.sistemaEconomico = sistemaEconomico; 
    } 
  
    public void printNotifications() 
    { 
        Iterador iterador = this.sistemaEconomico.crearIterador(); 
        System.out.println("-------SIMULADOR------------"); 
        while (iterador.tieneSiguiente()) 
        { 
            Persona p = (Persona)iterador.siguiente(); 
            System.out.println(p.getName()); 
        } 
    } 
}
