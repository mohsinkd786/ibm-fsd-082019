package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {

	public void run() {
		print("SET ::: ");
		createSet();
	}

	public void createSet() {
		print("Create SET : ");
		// Hash set
		// maintains uniqueness
		// doesn't ensure index /position based retrievals
		Set<String> msgs = new HashSet<String>();
		// insert elements in Set
		msgs.add("Hello");
		msgs.add("Hey");
		msgs.add("Hi");
		msgs.add("Hey");

		// traverse on the set
		Iterator<String> itr = msgs.iterator();
		while (itr.hasNext()) {
			print(itr.next());
			// not permitted
			// msgs.add("Hola");
		}
		msgs.add("Hola");
		for (String m : msgs) {
			print(m);
		}

		//
		print(" - TREE SET - ");
		Set<String> tSet = new TreeSet<String>();
		// copy data from Hash set to tree set
		tSet.addAll(msgs);
		tSet.add("Adamant");
		tSet.forEach(ms -> print(ms));

		//
		print(" - LINKED TREE SET - ");
		Set<String> linkSet = new LinkedHashSet<String>();
		// copy data from Hash set to tree set
		linkSet.add("One");
		linkSet.add("Two");
		linkSet.add("Three");
		linkSet.add("Adamant");
		linkSet.add("Two");

		linkSet.forEach(ms -> print(ms));

		// custom object should have
		// comparable implementation
		Set<User> tempSet = new TreeSet<User>();
		tempSet.add(new User(10, "Test"));
		tempSet.add(new User(11, "Sample"));

		tempSet.forEach(t -> print(t));
		print("Linked Hash Set ");
		Set<Temp> linkHSet = new LinkedHashSet<Temp>();
		linkHSet.add(new Temp(11, "Test"));
		linkHSet.add(new Temp(1, "Sample"));

		linkHSet.forEach(t -> print(t));
	}
}

class Temp {
	public int id;
	public String name;

	public Temp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID - " + id + ", Name : " + name;
	}
}