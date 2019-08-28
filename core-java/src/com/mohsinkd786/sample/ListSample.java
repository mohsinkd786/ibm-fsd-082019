package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public void run() {
		print("LIST OPERATIONS ::");
		createList();
		traverse();
		comparableSort();
		comparatorSort();
	}

	public void createList() {
		print("Creation ::");
		// Arraylist via list interface
		List<String> msgs = new ArrayList<String>();
		msgs.add("Hello");
		msgs.add("Hey");
		msgs.add("Hi");
		msgs.add("World");
		// msgs.add(0);
		// msgs.add(true);

		// remove an element
		// by index
		// msgs.remove(1);
		// by object
		// msgs.remove("Hey");

		// get element by Index
		// print(msgs.get(1));

		// iterate on the collection
		for (String m : msgs) {
			// not permitted
			// msgs.add("Welcome");
			// print(m);
		}
		// Iterator
		Iterator itr = msgs.iterator();

		while (itr.hasNext()) {
			// not permitted
			// array list is fail fast
			// msgs.add("Welcome");
			print(itr.next());
		}

		// forEach Consumer
		/*
		 * msgs.forEach(m -> { String mm = "Hello "; mm = mm.concat(m); print(mm); });
		 */

		msgs.forEach(m -> print(m));

	}

	public void traverse() {
		print("Traversal ::");
		List<String> _msgs = new ArrayList<String>();
		_msgs.add("Hello");
		_msgs.add("Hey");
		_msgs.add("Hi");
		_msgs.add("Hola");

		// sort msgs in asc order
		Collections.sort(_msgs);

		// traverse the sorted list
		_msgs.forEach(_msg -> print(_msg));

	}

	public void comparableSort() {

		// list of users
		List<User> usrs = new ArrayList<User>();
		// add users into list
		usrs.add(new User(2, "Tom"));
		usrs.add(new User(1, "John"));
		usrs.add(new User(3, "Roger"));

		usrs.forEach(u -> print(u));

		print("SORTED BY ID : ");
		Collections.sort(usrs);

		usrs.forEach(u -> print(u));

	}

	public void comparatorSort() {
		print("COMPARATOR :");

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(10, "admin", "ad@gg.com"));
		emps.add(new Employee(1, "guest", "guest@gmail.com"));
		emps.add(new Employee(71, "jack88", "jack@ibm.com"));
		emps.add(new Employee(5, "tinder", "tind@err.com"));

		emps.forEach(e -> print(e));

		// sort by Username via comparator
		SortEmpByUserName sortByUName = new SortEmpByUserName();

		Collections.sort(emps, sortByUName);

		print("SORTED BY USER NAME");

		emps.forEach(e -> print(e));

		//
		// sort by Email via comparator
		SortEmpByEmail sortByEmail = new SortEmpByEmail();

		Collections.sort(emps, sortByEmail);
		// Collections.reverse(emps);

		print("SORTED BY EMAIL ");

		emps.forEach(e -> print(e));

	}
}
