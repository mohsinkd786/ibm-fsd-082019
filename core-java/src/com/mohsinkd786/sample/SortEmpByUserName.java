package com.mohsinkd786.sample;

import java.util.Comparator;

public class SortEmpByUserName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getUserName().compareTo(o1.getUserName());
	}
}
