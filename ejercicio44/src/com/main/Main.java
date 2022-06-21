package com.main;

public class Main {

	public static void main(String[] args) {
		Developer dev1 = new Developer("Celia", "Lumbreras", 26, "12345678F", Profesiones.FULL_STACK_DEVELOPER);
		Developer dev2 = new Developer("Alicia", "Herrera", 22, "12345678H", Profesiones.FRONT_END_DEVELOPER);
		Developer dev3 = new Developer("Rogelio", "Cerdan", 22, "12345678G", Profesiones.BACK_END_DEVELOPER);
		
		Developer[] devs = {dev1, dev2, dev3};
		for (Developer dev: devs) {
			if ((dev.getRolTecnologico().equals(Profesiones.FULL_STACK_DEVELOPER))||
				(dev.getRolTecnologico().equals(Profesiones.BACK_END_DEVELOPER))){
				System.out.println("Viva el Back");
			}else if (dev.getRolTecnologico().equals(Profesiones.FRONT_END_DEVELOPER)) {
				System.out.println("JS es una 💩, es mejor usar TypeScript");
			}
		}
	}

}
