package com.mohsinkd786.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class ExceptionMain {

	public static void main(String[] args) {

		int[] nums = new int[] { 10, 11 };
		ThrowException throEx = new ThrowException();
		try {
			throEx.sayHello(true);
			int i = nums[3];

		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
			// get cause message
			System.out.println(ex.getCause().getMessage());
			// get cause object
			Throwable e = ex.getCause();

			// ex.printStackTrace();

		} catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
			// e.printStackTrace();

		}
		//
		// Exception Handling in Inheritance
		Super sup = new Sub();
		try {
			sup.add();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block");
		}

		// not permitted in java
		/*
		 * try { sup.subtract(); }finally {
		 * 
		 * }
		 */
		try (BufferedReader file = new BufferedReader(new FileReader(""))) {

		} catch (IOException ex) {

		}
		Super sub = new Sub();
		try {
			sub.compute();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}
