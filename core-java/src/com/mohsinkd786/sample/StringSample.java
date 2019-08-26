package com.mohsinkd786.sample;

public class StringSample {

	public static void main(String[] args) {

		String _msg = "Hello"; // String literals // They get created in String Pool
		String _msg1 = "Hello";

		String _str = new String("Hello"); // String objects
		String _str1 = new String("Hello");

		if (_msg == _msg1) {
			System.out.println("Valid literals");
		}

		if (_str == _str1) {
			System.out.println("Valid String Objects");
		}

		if (_str1.equals(_msg)) {
			System.out.println("Values seems to validate");
		}
		// Push String object to String Pool
		_str1 = _str1.intern();

		if (_msg == _str1) {
			System.out.println("String has been moved to String Pool");
		}

		char[] arr = _msg.toCharArray(); // convert String to character Array

		String _sub = _str1.substring(0, 2); // get a sub String from the existing String

		System.out.println(_sub);

		System.out.println(_str1);

		// append to the String
		_str1 = _str1.concat(" World");

		System.out.println(_str1);

		int _index = _str1.indexOf('l');
		System.out.println(_index);

		// _index = _str1.indexOf(_str1);

		// System.out.println(_index);

		String msg = "Welcome to IBM";
		System.out.println(msg.compareTo(_str1));

		String strIndex = String.valueOf(_index);

		char cr = '#';

		String strChar = String.valueOf(cr);

	}
}
