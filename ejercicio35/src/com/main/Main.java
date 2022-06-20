package com.main;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Eva");
		cliente.setApellidos("Lopez");
		cliente.setDocumento("12345678D");
		cliente.setTipo("Arcoiris");
		cliente.setCategoria("A");
		cliente.generarCodigo();
		
		System.out.println(cliente.getApellidos()+" "+cliente.getCategoria()+" "+cliente.getCodigo());
		
		Empleado empleado = new Empleado();
		
		empleado.setNombre("Laura");
		empleado.setApellidos("Herrera");
		empleado.setDocumento("87654321F");
		empleado.setTipo("Rojo");
		empleado.setTipoContrato("Indefinido");
		empleado.setSueldo(1000);
		
		System.out.println(empleado.getApellidos()+" "+empleado.getTipoContrato()+" "+empleado.getSueldo());
		
	}

}
