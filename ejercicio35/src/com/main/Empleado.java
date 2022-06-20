package com.main;

public class Empleado extends Persona{
	private String tipoContrato;
	private float sueldo;
	
	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public void calcularSueldo() {};
}
