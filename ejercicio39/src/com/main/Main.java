package com.main;

public class Main {

	public static void main(String[] args) {
		Car honda = new Car("Honda",100);
		Car jeep = new Car("Jeep",500);
		Car bmw = new Car("BMW",800);
		
		honda.getSpeed();
		jeep.getSpeed();
		bmw.getSpeed();
	}

}
