package com.patrones;

public interface Contract {
	void contratar(Object ente, int costo, int tiempo);
    void disolver(Object ente, int penalizacion);
    void pagar(Object ente);
}