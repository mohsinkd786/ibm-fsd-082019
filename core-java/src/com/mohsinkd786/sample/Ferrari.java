package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

public class Ferrari {

	private void execute(Automobile.Speedster speedster) {
		speedster.topSpeed();
	}

	void process() {
		// ferrari anonymous class
		Automobile.Speedster ferrari = new Automobile.Speedster() {

			@Override
			public void torque() {
				print("4000");
			}

			@Override
			public void topSpeed() {
				print("FERRARI : " + 800);
			}
		}; // end of anonymous class

		// call the anonymous class methods
		// ferrari.topSpeed();
		// call execute method for ferrari
		execute(ferrari);

		// porshe anonymous class
		Automobile.Speedster porshe = new Automobile.Speedster() {

			@Override
			public void torque() {
				print("4000");
			}

			@Override
			public void topSpeed() {
				print("PORSHE : " + 770);
			}
		}; // end of anonymous class

		// call the anonymous class methods
		// porshe.topSpeed();
		// call execute method for porshe
		execute(porshe);
	}
}
