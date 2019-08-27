package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

public class Mercedes implements Automobile.Speedster {

	@Override
	public void topSpeed() {
		print("550");
	}

	@Override
	public void torque() {
		print(3000);
	}

}
