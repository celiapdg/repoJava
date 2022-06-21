package com.main;

public class Main {

	public static void main(String[] args) {
		if (args[0].equals("Federico")&&args[1].equals("GarciaLorca")) Lorca.recitar();
		else NoAutorizado.malosParametros();
	}

}
