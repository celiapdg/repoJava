package com.main;

public class Developer {
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	private Profesiones rolTecnologico;
	
	public Developer() {
	}
	
	public Developer(String nombre, String apellidos, int edad, String dni, Profesiones rolTecnologico) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		this.rolTecnologico = rolTecnologico;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Profesiones getRolTecnologico() {
		return rolTecnologico;
	}
	public void setRolTecnologico(Profesiones rolTecnologico) {
		this.rolTecnologico = rolTecnologico;
	}
	
	
}
