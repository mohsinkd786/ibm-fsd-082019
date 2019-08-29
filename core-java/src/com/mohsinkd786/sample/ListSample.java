package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListSample {

	public void run() {
		print("LIST OPERATIONS ::");
		createList();
		traverse();
		comparableSort();
		comparatorSort();
		comparatorByProject();
		createListFromArray();
		java8Streams();
		java8StreamRevision();
	}

	public void createList() {
		print("Creation ::");
		// Array list via list interface
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
		// for (String m : msgs) {
		// not permitted
		// msgs.add("Welcome");
		// print(m);
		// }
		// Iterator
		Iterator<String> itr = msgs.iterator();

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

	public void comparatorByProject() {

		print("Emps with Projects ");
		List<Employee> empByPrj = new ArrayList<Employee>();
		empByPrj.add(new Employee(10, "admin", "ad@gg.com", new Project(11, "ATT")));
		empByPrj.add(new Employee(1, "guest", "guest@gmail.com", new Project(6, "Google")));
		empByPrj.add(new Employee(71, "jack88", "jack@ibm.com", new Project(8, "Amazon")));
		empByPrj.add(new Employee(5, "tinder", "tind@err.com", new Project(9, "Tmobile")));

		// defining the compare method
		// using lambda function
		Collections.sort(empByPrj, (a, b) -> {
			return b.getProject().getName().compareTo(a.getProject().getName());
		});
		empByPrj.forEach(e -> print(e));
	}

	public void createListFromArray() {
		User[] users = new User[3];
		users[0] = new User(2, "Tom");
		users[1] = new User(1, "Rick");
		users[2] = new User(4, "Sam");

		// convert array to a list
		List<User> usrs = Arrays.asList(users);

		// User u;
		// convert list to array
		User[] usrArr = usrs.toArray(new User[0]);
		print("----> " + usrArr[0]);

		// create / initialize the array
		// & convert into the list
		List<User> userlst = Arrays.asList(new User[] { new User(12, "Adam"), new User(5, "Rancher") });

	}

	public void java8Streams() {
		print("STREAMS :");
		List<Employee> empWithPrj = new ArrayList<Employee>();
		empWithPrj.add(new Employee(10, "admin", "ad@gg.com", new Project(11, "ATT"), 10000));
		empWithPrj.add(new Employee(1, "guest", "guest@gmail.com", new Project(6, "Google"), 400000));
		empWithPrj.add(new Employee(71, "jack88", "jack@ibm.com", new Project(11, "ATT"), 350000));
		empWithPrj.add(new Employee(5, "tinder", "tind@err.com", new Project(9, "Tmobile"), 20000));

		/*
		 * List<Employee> filteredList = new ArrayList<Employee>(); for (Employee e :
		 * empWithPrj) { if (e.getProject().getName().equals("ATT")) { if (e.getSalary()
		 * > 50000) { filteredList.add(e); } } } // end of for each
		 * 
		 * filteredList.forEach(e -> print(e));
		 */
		// use streams api
		List<Employee> filteredEmps = empWithPrj.stream().filter(emp -> {
			return "ATT".equals(emp.getProject().getName());
		}).filter(e -> {
			return e.getSalary() > 50000;
		}).collect(Collectors.toList());

		// converting Employee to User
		// List<User> users =
		filteredEmps.stream().map(e -> {
			return new User(e.getId(), e.getEmail());
		})
				// .collect(Collectors.toList());
				.forEach(u -> print(u));
	}

	public void java8StreamRevision() {
		print("Java 8 Stream Revision with Custom Implementations");
		List<User> usrs = Arrays.asList(new User[] { 
				new User(101, "Tim"),
				new User(8, "Sulk"),
				new User(6, "Pentair"),
				new User(102, "Bumpy"), new User(110, "Humpty"), });

		// get the stream object
		Stream<User> uStream = usrs.stream();
		Predicate<User> findUserById = new FindUserById();

		uStream = uStream.filter(findUserById);
		Consumer<User> traverseUsers = new TraverseUsers();

		uStream.forEach(traverseUsers);

		// usrs.stream().filter(u -> {
		// return u.getId() < 10;
		// }).forEach(u -> print(u));
		//Map<String, List<User>> mp = uStream.collect(Collectors.groupingBy(User::getName));
		//mp.forEach((k, v) -> print(k + "<-->" + v));
	}

	
}

// Predicate to validate a condition
class FindUserById implements Predicate<User> {

	@Override
	public boolean test(User u) {
		print("FindUserById test()");
		if (u.getId() < 10) {
			return true;
		} else {
			return false;
		}
	}
}

// consumer to traverse on the list of objects
class TraverseUsers implements Consumer<User> {

	@Override
	public void accept(User t) {
		print("TraverseUsers accept()");
		print(t);
	}
}
