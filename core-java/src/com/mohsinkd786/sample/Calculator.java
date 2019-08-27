package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

@FunctionalInterface
public interface Calculator {
	int calculate(int i, int j, String operand);
}

@FunctionalInterface
interface Message {
	void sayHello();

	default void getMessage() {
		print("Message received");
	}
}