package com.main;

public class Main {

	public static void main(String[] args) {
		AnimalCarnivoro carnivoro = new AnimalCarnivoro();
		carnivoro.alimentarse();
		
		AnimalHerbivoro herbivoro = new AnimalHerbivoro();
		herbivoro.alimentarse();
		
		Planta planta = new Planta();
		planta.alimentarse();
	}

}
