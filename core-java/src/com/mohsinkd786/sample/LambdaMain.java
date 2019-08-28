package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaMain {

	public static void main(String[] args) {

		Calculator calc = new Calculator() {

			@Override
			public int calculate(int i, int j, String operand) {

				if ("ADD".equals(operand)) {
					return i + j;
				} else {
					return 0;
				}
			}

		}; // end of anonymous class
		int sum = calc.calculate(10, 2, "ADD");
		print(sum);

		// lambda expression
		// create the lambda object
		// define implementation for calculate() method
		Calculator lambCalc = (_first, _next, operand) -> {
			return _first + _next;
		}; // end of lambda

		sum = lambCalc.calculate(10, 8, "ADD");
		print(sum);

		// lambda expression
		Message msg = () -> print("Hello Message Lambda");
		msg.sayHello();
		// call the default method
		msg.getMessage();

		List<User> usrs = new ArrayList<User>();
		usrs.add(new User(1, "Mohsin"));
		usrs.add(new User(2, "John"));
		usrs.add(new User(3, "Tom"));
		usrs.add(new User(3, "Tom"));

		Map<String, User> uMap = usrs.stream().collect(Collectors.toMap(u -> u.getName(), u -> u, (olD, neW) -> olD));
		uMap.forEach((k, v) -> print(k));
	}
}