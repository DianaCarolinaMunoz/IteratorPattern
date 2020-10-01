package com.patrones;

public interface Contract {
	public void contratar(Object ente, int costo, int tiempo);
    public void disolver(Object ente, int penalizacion);
    public void pagar(Object ente);

}
