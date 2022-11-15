package test.keyword;

import java.util.Random;

public class Employee {
	private static final Random employeeIdGenerator = new Random();
	private int employeeId;
	private String name;
	private String title;
	private Double salary;
	
	public Employee() {
		this.employeeId = Math.abs(employeeIdGenerator.nextInt());
	}
	public Employee(String name, String title, double salary) {
		
		// a call to a no-argument constructor
		this();
		
		this.name = name;
		this.title = title;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("ID:%d, Name:%s, Title:%s, Salary:%f", employeeId, name, title, salary);
	}
}
