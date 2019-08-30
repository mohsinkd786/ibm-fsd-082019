package com.mohsinkd786.sample;

public interface ProductService {

	void sum();

	default void add() {
		System.out.println("Add in ProductService");
	}

	static void calculate() {
		System.out.println("static calculate in ProductService");
	}
}

interface ItemService {
	default void add() {
		System.out.println("Add in ItemService");
	}
}