package com.mohsinkd786.sample;

public class MammalMain {

	public static void main(String[] args) {

		Mammal human = new Human();
		human.setLegs(2);

		Mammal animal = new Animal();
		animal.setLegs(4);

		WhoAmI whoAmI = new WhoAmI();

		// human
		whoAmI.identifyMe(human);

		// animal
		whoAmI.identifyMe(animal);

		// English

		English english = new English();
		english.setLegs(2);
		
		whoAmI.identifyMe(english);
	}
}
