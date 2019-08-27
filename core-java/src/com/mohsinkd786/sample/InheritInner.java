package com.mohsinkd786.sample;

public class InheritInner {

	class Inner {
		void sayHello() {

		}
	}

	static class StaInner {
		void sayHello() {

		}
		static void say() {
			
		}
	}

	abstract class Abs {
		abstract void sayHello();
	}

	interface I1 {
		void sum();
	}
}

class SayHello extends InheritInner.StaInner {
	
	SayHello() {
		//new InheritInner().super();
		
	}	
}