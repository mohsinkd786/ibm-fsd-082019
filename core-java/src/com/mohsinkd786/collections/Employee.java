package com.mohsinkd786.collections;

public class Employee {

	private int id;
	private String name;
	private Project project;
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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", project=" + project + "]";
	}
	public Employee(int id, String name, Project project) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
	}
	
}
