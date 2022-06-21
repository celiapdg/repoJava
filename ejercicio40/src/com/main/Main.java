package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Introduce un entero: ");
		int entero = scn.nextInt();
		System.out.print("Introduce un booleano: ");
		boolean booleano = scn.nextBoolean();
		System.out.print("Introduce una string: ");
		String cadena = scn.next();
		System.out.print("Introduce un byte: ");
		byte intByte = scn.nextByte();
		
		System.out.println("Entero "+entero+"\nBooleano "+booleano+"\nString "+cadena+"\nByte "+intByte);
	}

}
