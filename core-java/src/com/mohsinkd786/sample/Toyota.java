package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

//extend Non Static Inner class
public class Toyota extends Automobile.Car {

	Toyota(String msg) {
		// print("Toyota constructor");
		// load default parent object
		new Automobile().super(msg);
		// new Automobile().new Automobile.Car();
		print("Toyota constructor");
	}

	public void fuelType() {
		print("Petrol");
	}
}