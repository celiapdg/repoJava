package com.main;

public class Alumno implements IPersona{
	private String nombre;
	private int curso;


	public float getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
