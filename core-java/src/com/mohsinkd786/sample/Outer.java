package com.mohsinkd786.sample;

public class Outer {

	
	void add() {
		System.out.println("Hello add()");
	}

	static void divide() {
		System.out.println("Hello divide()");
	}

	void process() {
		System.out.println("process()");

		// local inner class
		class Process {
			void calculate() {
				System.out.println("calculate()");
			}
			// not permitted
			// static void execute() {

			// }
		}
		// instantiate Local inner class
		Process proc = new Process();
		// call local inner class methods
		proc.calculate();

		// not permitted
		// static class Process1 {

		// }
	}

	// static method
	static void execute() {
		// not permissible
		// static String str;
		int i = 10;

		// not permissible
		// static class Process {

		// }
		// local inner class
		class Hello {
			void sayHello() {
				System.out.println("Say Hello()");
			}
		}
	}

	// inner class
	class Inner {
		// static isnt permitted
		// static String str;
		// static {

		// }

		// non static
		void sub() {
			// call instance method via this keyword
			Outer.this.add();
			// call static method from outer class
			Outer.divide();
			System.out.println("Hello sub()");
		}
		// not permitted
		// static method
		// static void compute() {
		// System.out.println("Hello static compute()");
		// }
	}

	// static class
	static class StaticInner {
		// non static
		void sub() {
			System.out.println("Hello static sub()");
		}

		// static method
		static void compute() {
			System.out.println("Hello static compute()");
		}
	}
}
