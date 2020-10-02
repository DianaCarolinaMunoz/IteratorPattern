package com.patrones;

public class Empresa extends EnteEconomico {

	private String razonSocial;

	public Empresa(Empresa empresa, int identificador, float patrimonio, String razonSocial) {
		super(empresa, identificador, patrimonio);
		this.razonSocial = razonSocial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

}
