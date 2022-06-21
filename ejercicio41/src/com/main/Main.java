package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = scn.nextLine();
		System.out.println("Introduce tu apellido: ");
		String apellido = scn.nextLine();
		
		System.out.println("Saludos, "+nombre+" "+apellido);
		System.out.println("Jugamos a 3 en raya?");
		
		String header = "| |1|2|3|";
		String fila1 =  "|1| | | |";
		String fila2 =  "|2| | | |";
		String fila3 =  "|3| | | |";
		
		String[] tablero = {header,fila1,fila2,fila3};
		
		System.out.println(String.join("\n", tablero));
		
		ArrayList<Integer[]> posiciones = new ArrayList<Integer[]>();
		
		
		boolean jugador = Math.round(Math.random())==0?true:false;
		if (!jugador) System.out.println("Comienzo yo: ");
		System.out.println();
		Integer[] nuevaPosicion;
		while (posiciones.size()<9) {
			if (jugador) {
				nuevaPosicion = pedirPosiciones(posiciones);
				jugador=false;
			}else {
				nuevaPosicion = generarPosiciones(posiciones);
				jugador=true;
			}
			posiciones.add(nuevaPosicion);
			tablero = pintarPosicion(tablero,nuevaPosicion,!jugador);
			if (alguienGana(tablero,!jugador)&&!jugador) {
				System.out.println("Has ganado 🎉");
				break;
			}else if (alguienGana(tablero,!jugador)&&jugador) {
				System.out.println("Has perdido");
				break;
			}
		}
		
		
	}
	
	public static String[] pintarPosicion(String[] tablero, Integer[] nuevaPosicion, boolean jugador){
		String fila = tablero[nuevaPosicion[0]];
		String marca = jugador?"X":"O";
		
		int y = nuevaPosicion[1];
		
		fila = fila.substring(0,1+2*y)+marca+fila.substring(2+2*y);
		tablero[nuevaPosicion[0]]=fila;
		System.out.println(String.join("\n", tablero));
		System.out.println("");
		return tablero;
		}
		
	
	public static Integer[] pedirPosiciones(ArrayList<Integer[]> posicionesUsadas) {
		Scanner ask = new Scanner(System.in);
		while (true) {
			System.out.println("Elige la fila: ");
			int x = ask.nextInt();
			System.out.println("Elige la columna: ");
			int y = ask.nextInt();
			Integer[] nuevaPosicion = {x,y};
			if ((x>=1)&&(x<=3)&&
				(y>=1)&&(y<=3)) {
				if (comprobarLibre(posicionesUsadas,nuevaPosicion)) return nuevaPosicion;
			} else {
				System.err.print("Las posiciones deben estar entre 1 y 3\n");
			}
			
		}
	}
	
	
	public static Integer[] generarPosiciones(ArrayList<Integer[]> posicionesUsadas) {
		while (true) {
			int x = (int) Math.round(Math.random()*2) + 1;
			int y = (int) Math.round(Math.random()*2) + 1;
			Integer[] nuevaPosicion = {x,y};
			if (comprobarLibre(posicionesUsadas,nuevaPosicion)) return nuevaPosicion;
		}
	}
	
	
	public static boolean comprobarLibre(ArrayList<Integer[]> posicionesUsadas, 
										 Integer[] nuevaPosicion) {
		for(Integer[] posicion:posicionesUsadas) {
			if (Arrays.equals(posicion, nuevaPosicion)) {
				System.out.println("Posición ocupada");
				return false;
			}
		}
		return true;
	}
	
	public static boolean alguienGana(String[] tablero, boolean jugador) {
		char marca = jugador?'X':'O';
		// comprobar filas
		int ganaFila1 = (int) tablero[1].chars().filter(ch -> ch == marca).count();
		int ganaFila2 = (int) tablero[2].chars().filter(ch -> ch == marca).count();
		int ganaFila3 = (int) tablero[3].chars().filter(ch -> ch == marca).count();
		
		if (ganaFila1==3||ganaFila2==3||ganaFila3==3) return true;
		
		// comprobar columnas
		if (((tablero[1].charAt(3) == marca)&&
			(tablero[1].charAt(3) == tablero[2].charAt(3))&&
			(tablero[1].charAt(3) == tablero[3].charAt(3)))||
			((tablero[1].charAt(5) == marca)&&
			(tablero[1].charAt(5) == tablero[2].charAt(5))&&
			(tablero[1].charAt(5) == tablero[3].charAt(5)))||
			((tablero[1].charAt(7) == marca)&&
			(tablero[1].charAt(7) == tablero[2].charAt(7))&&
			(tablero[1].charAt(7) == tablero[3].charAt(7)))) {
			return true;
		}
		
		// comprobar diagonales
		if (((tablero[1].charAt(3) == marca)&&
				(tablero[1].charAt(3) == tablero[2].charAt(5))&&
				(tablero[1].charAt(3) == tablero[3].charAt(7)))||
				((tablero[1].charAt(7) == marca)&&
				(tablero[1].charAt(7) == tablero[2].charAt(5))&&
				(tablero[1].charAt(7) == tablero[3].charAt(3)))) {
				return true;
			}
		
		return false;
	}
}
