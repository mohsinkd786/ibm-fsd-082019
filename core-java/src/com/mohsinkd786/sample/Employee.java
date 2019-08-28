package com.mohsinkd786.sample;

public class Employee {

	Employee() {

	}

	private int id;
	private String userName;
	private String email;
	private Project project;
	private float salary;

	public Employee(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public Employee(int id, String userName, String email, Project project) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.project = project;
	}

	public Employee(int id, String userName, String email, Project project, float salary) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.project = project;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", userName=" + userName + ", email=" + email + ", project = " + project
				+ "salary : " + salary + "]";
	}

}
