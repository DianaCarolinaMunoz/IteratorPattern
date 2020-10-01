package com.patrones;

public class Simulador {
	SistemaEconomico sistemaEconomico; 
	  
    public Simulador(SistemaEconomico sistemaEconomico) 
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
