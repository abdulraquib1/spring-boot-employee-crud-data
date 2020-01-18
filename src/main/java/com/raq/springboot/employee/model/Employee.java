package com.raq.springboot.employee.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details of the Employee attributes")
@Entity
public class Employee {
	
		
	@Id
	@ApiModelProperty(notes="Enter the Id of the employee")
	private int id;
		
	@ApiModelProperty(notes="Enter the name of the employee")
	private String name;
	
	@ApiModelProperty(notes="Enter the age of the employee in years")
	private int age;
	
	@ApiModelProperty(notes="Enter the salary of the employee in years")
	private double salary;
	
	//@OneToMany(mappedBy="employee")
	//private List<Address> addresses;
	
	
	public Employee() {
	
	}

	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
/*	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}	*/
}