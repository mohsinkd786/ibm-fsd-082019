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

		// _str = "Hello"
		// split by 'e'
		// str[0] = "H"
		// str[1] = "llo"

		// split a string
		String[] splitStr = _str.split("e");

		System.out.println(splitStr[1]);

		// String buffer is thread safe
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		System.out.println(sb);
		
		String strSb = sb.toString();
		
		// String builder is not thread safe
		StringBuilder sbuild = new StringBuilder();
		sbuild.append("Hello");
		sbuild.append(" ");
		sbuild.append("World");
		
		System.out.println(sbuild);
		
		System.out.println("SB Capacity "+sb.capacity());
		System.out.println("S builder Capacity "+sbuild.capacity());
	
		sbuild.append("hhhhhhhhhhhh");
		
		System.out.println("S builder Capacity "+sbuild.capacity());
		
		// Hello
		// 01234
		// replace from 0 till 3
		// replace Hel with Welcome
		// Welcomelo
		
		sb = sb.replace(0, 3, "Welcome");
		System.out.println(sb);
		
		// get reverse of a String buffer
		// new String buffer is
		// olemocleW
		// 012345678
		sb.reverse();
		sbuild.reverse();
		
		// new String buffer after deletion
		// olcleW
		// remove a part of the string
		sb = sb.delete(2, 5);
		System.out.println(sb);
	
		String str = "10";
		
		sb.append(10);
		sb.append(112.77);
		
		System.out.println(sb);
		str = sb.toString();
		
		User user = new User();
		user.setId(10);
		user.setName("Bob");
		
		User user1 = new User();
		user1.setId(11);
		user1.setName("Adams");
		
		System.out.println(user.toString());
		System.out.println(user1.toString());
		
	}
}
