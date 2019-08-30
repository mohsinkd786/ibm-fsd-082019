package com.mohsinkd786.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpProjectMain {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();
		Employee emp1 = new Employee(1, "Bob", new Project(1, "ATT"));
		Employee emp2 = new Employee(2, "John", new Project(1, "ATT"));
		Employee emp3 = new Employee(3, "Sam", new Project(2, "TMobile"));

		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);

		Set<Project> projects = new HashSet<Project>();
		List<Project> updatedProjects = new ArrayList<Project>();

		emps.forEach(e -> {
			Project p = e.getProject();
			p.employees = new ArrayList<Employee>();

			projects.add(p);

		});

		projects.forEach(project -> {

			emps.forEach(emp -> {

				if (emp.getProject().getId() == project.getId()) {
					int index = updatedProjects.indexOf(project);

					if (index < 0) {

						Project prj = new Project();
						prj.setId(project.getId());
						prj.setName(project.getName());
						// add employee to the project's employee list
						prj.employees.add(emp);

						updatedProjects.add(prj);

					} else {

						updatedProjects.get(index).employees.add(emp);
					}
				}
			});

		});

		//
		// Collections - class - sort
		// Collection - Interface - add/addAll
		updatedProjects.forEach(up -> System.out.println(up));
	}
}
