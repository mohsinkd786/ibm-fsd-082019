package com.mohsinkd786.sample;

public abstract class Mammal {

	private int legs;

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	abstract void whoAmI();
}

class Human extends Mammal {

	@Override
	public void whoAmI() {
		System.out.println("I am Human I have " + this.getLegs() + " legs");
	}
}

class Animal extends Mammal {

	@Override
	public void whoAmI() {
		System.out.println("I am an Animal I have " + this.getLegs() + " legs");
	}
}

interface Ethnic {
	void iAmFrom();
}

class English extends Human implements Ethnic {

	@Override
	public void iAmFrom() {
		System.out.println("I am from Britain");
	}
}

class NonEnglish extends Human implements Ethnic {

	@Override
	public void iAmFrom() {
		System.out.println("I am Not from Britain");
	}
}

class WhoAmI {
	public void identifyMe(Mammal m) {
		m.whoAmI();

		if (m instanceof Ethnic) {
			((Ethnic) m).iAmFrom();
		}
	}
}