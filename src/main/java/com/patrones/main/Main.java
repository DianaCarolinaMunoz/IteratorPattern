package com.patrones.main;

import com.patrones.ColeccionIterable;
import com.patrones.Simulador;
import com.patrones.SistemaEconomico;

public class Main {

	public static void main(String args[]) 
    { 
        ColeccionIterable se = new SistemaEconomico(); 
        Simulador simulador = new Simulador(se); 
        simulador.print(); 
    }
}
