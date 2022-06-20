package com.main;

public class Cliente extends Persona{
	private String categoria;
	private String codigo;
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void generarCodigo() {
		this.codigo = "123HJG1";
	}

}
