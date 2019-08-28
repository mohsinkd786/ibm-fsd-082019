package com.mohsinkd786.sample;

public class User implements Comparable<User> {

	public User() {

	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User: { ID : " + id + ", NAME : " + name + " }";
	}

	@Override
	public int compareTo(User obj) {

		if (obj.getId() > this.getId()) {
			return -1;
		} else if (obj.getId() < this.getId()) {
			return 1;
		} else {
			return 0;
		}
	}
}
