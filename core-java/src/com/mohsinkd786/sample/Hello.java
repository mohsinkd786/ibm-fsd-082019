package com.mohsinkd786.sample;

class Hello {

	public static void main(String[] args) {

		Welcome wel = new Welcome();
		Welcome wel1 = new Welcome();
	}
}

class Welcome {
	static {
		System.out.println("Welcome Static Block");
	}
	// instance block
	{
		System.out.println("Welcome Instance Block");

	}

	Welcome() {

		System.out.println("Welcome constructor");
	}
}