package com.patrones.main;

import com.patrones.Simulador;

public class Main {

	public static void main(String args[]) {
		Simulador simulador = new Simulador();
		simulador.crearEmpresas();
		simulador.print();
	}
}
