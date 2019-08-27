package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

public class Automobile {
	Automobile() {
		print("Auto constructor");
	}

	void engine() {
		print("Automobile Engine");
	}

	// abstract class
	abstract class Car {
		Car(String msg) {
			print(msg);
		}

		abstract void fuelType();
	}

	// static class
	static class Bike {
		void speed() {
			print("Speedster");
		}
	}

	// inner interface
	interface Speedster {
		void topSpeed();

		void torque();
	}
}
