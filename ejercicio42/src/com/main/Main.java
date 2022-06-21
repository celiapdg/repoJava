package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.println("Introduce un entero: ");
			int entero = scn.nextInt();
			System.out.println(entero);
		} catch (InputMismatchException e) {
			System.err.print("Dije un entero... :(");
		}
		
		try {
			System.out.println("Introduce un booleano: ");
			boolean booleano = scn.nextBoolean();
		} catch (Exception e) {
			System.err.print("Dije un booleano... :(");
		}
		
		try {
			System.out.println("Introduce una string: ");
			String cadena = scn.next();
		} catch (Exception e) {
			System.err.println("Dije una string... :(");
		}
		
		try {
			System.out.println("Introduce un byte: ");
			byte intByte = scn.nextByte();
		} catch (Exception e) {
			System.err.println("Dije un byte... :(");
		}
		
		


		
	}

}
