package com.mohsinkd786.sample;

public class ProductServiceImpl implements ProductService, ItemService {

	@Override
	public void sum() {
		// call static method
		ProductService.calculate();
		// add();
		System.out.println("Sum in ProductServiceImpl ");
	}

	@Override
	public void add() {
		// parent ProductService Interface
		ProductService.super.add();
		//
		ItemService.super.add();

		System.out.println("Add in Class");
	}

	public static void main(String[] ashjas) {
		ProductService service = new ProductServiceImpl();
		service.sum();

		ProductService.calculate();
		service.add();
	}
}
