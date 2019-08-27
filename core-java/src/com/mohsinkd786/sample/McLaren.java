package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

public class McLaren implements Automobile.Speedster {

	@Override
	public void topSpeed() {
		print("600");
	}

	@Override
	public void torque() {
		print(4000);
	}
}
