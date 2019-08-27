package com.mohsinkd786.sample;

public class InheritMain {

	public static void main(String[] args) {

		Toyota toy = new Toyota("Constructor");
		// toy.fuelType();

		// create the object of implemented class
		Automobile.Speedster mcLaren = new McLaren();
		mcLaren.topSpeed();

		Automobile.Speedster mercBenz = new Mercedes();
		mercBenz.topSpeed();
		
		// anonymous classes
		Ferrari ferrari = new Ferrari();
		ferrari.process();
		
	}
}
