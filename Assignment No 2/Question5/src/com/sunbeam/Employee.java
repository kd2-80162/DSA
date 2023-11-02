package com.sunbeam;

public class Employee {
	private int id;
    private String Name;
    private Double Salary;
    
    public Employee() {
    	
    }

    

	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		Name = name;
		Salary = salary;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
    
	
    
}
