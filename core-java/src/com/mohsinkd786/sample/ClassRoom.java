package com.mohsinkd786.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassRoom {

	public int id;
	public String name;
	public List<Student> students = new ArrayList<Student>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassRoom other = (ClassRoom) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", name=" + name + ", students=" + students + "]";
	}

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

	public static void main(String[] abc) {

		Student st1 = new Student();
		st1.id = 1;
		st1.name = "abc";
		st1.className = new ClassRoom();
		st1.className.id = 1;
		st1.className.name = "One";

		Student st2 = new Student();

		st2.id = 2;
		st2.name = "xyz";
		st2.className = new ClassRoom();
		st2.className.id = 2;
		st2.className.name = "Two";

		Student st3 = new Student();

		st3.id = 3;
		st3.name = "sam";
		st3.className = new ClassRoom();
		st3.className.id = 1;
		st3.className.name = "One";

		List<Student> stds = new ArrayList<Student>();
		stds.add(st1);
		stds.add(st2);
		stds.add(st3);

		Set<ClassRoom> classes = new HashSet<ClassRoom>();
		List<ClassRoom> updatedClasses = new ArrayList<ClassRoom>();

		stds.forEach(st -> classes.add(st.className));

		classes.forEach(cl -> {
			stds.forEach(st -> {
				if (cl.id == st.className.id) {
					int index = updatedClasses.indexOf(cl);
					
					if (index < 0) {
						ClassRoom cls = new ClassRoom();
						cls.id = cl.id;
						cls.name = cl.name;
						cls.students.add(st);
						updatedClasses.add(cls);

					} else {
						updatedClasses.get(index).students.add(st);
					}

				}
			});
		});
		updatedClasses.forEach(c -> System.out.println(c));
	}
}
