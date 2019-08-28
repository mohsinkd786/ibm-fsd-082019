package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public void run() {
		createList();

	}

	public void createList() {
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
			//print(m);
		}
		// Iterator
		Iterator itr = msgs.iterator();

		while (itr.hasNext()) {
			// not permitted
			// array list is fail fast
			// msgs.add("Welcome");
			//print(itr.next());
		}

		// forEach Consumer
		/*
		 * msgs.forEach(m -> { String mm = "Hello "; mm = mm.concat(m); print(mm); });
		 */

		msgs.forEach(m -> print(m));
	}
}
