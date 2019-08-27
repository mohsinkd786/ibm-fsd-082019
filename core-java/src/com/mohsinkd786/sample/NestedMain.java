package com.mohsinkd786.sample;

public class NestedMain {

	public static void main(String[] args) {

		//
		Outer outer = new Outer(); //
		outer.add();
		// instantiate inner class
		Outer.Inner inner = outer.new Inner();

		inner.sub();
		Outer.divide();
		
		// instantiate static class
		Outer.StaticInner staticInner = new Outer.StaticInner();
		// call non static method
		staticInner.sub();
		// call static method
		Outer.StaticInner.compute();

	}
}
