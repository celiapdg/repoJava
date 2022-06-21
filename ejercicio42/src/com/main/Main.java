package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ejercicio1(scn);

		int[] array = {1,2,3,4};
		try {
			muestraItem(array, 4);
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(aiobe.getMessage());
		}
		
		try {
			dividePorCero();
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
		
		
	}
	
	public static void ejercicio1(Scanner scn) {
		try {
			System.out.println("Introduce un entero: ");
			int entero = scn.nextInt();
			System.out.println(entero);
		} catch (InputMismatchException e) {
			System.err.print("Dije un entero... :(\n");
			scn.nextLine();
		}
		
		try {
			System.out.println("Introduce un booleano: ");
			boolean booleano = scn.nextBoolean();
			String cadena = scn.nextLine();
			System.out.println(booleano);
		} catch (Exception e) {
			System.err.print("Dije un booleano... :(\n");
			String cadena = scn.nextLine();
		}
		
		try {
			System.out.println("Introduce una string: ");
			String cadena = scn.nextLine();
			System.out.println(cadena);
		} catch (Exception e) {
			System.err.println("Dije una string... :(\n");
			scn.nextLine();
		}
		
		try {
			System.out.println("Introduce un byte: ");
			byte intByte = scn.nextByte();
			System.out.println(intByte);
		} catch (Exception e) {
			System.err.println("Dije un byte... :(\n");
			scn.nextLine();
		}
		
	}
	
	public static void muestraItem(int[] array, int posicion) throws ArrayIndexOutOfBoundsException{
		if (posicion >= array.length) throw new ArrayIndexOutOfBoundsException("el indice es demasiado grande");
		System.out.println(array[posicion]);
	}

	public static void dividePorCero() throws ArithmeticException{
		System.out.println(2/0);
	}
}
