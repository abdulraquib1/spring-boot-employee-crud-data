package com.raq.springboot.employee.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private Integer id;

	private String addressDetails;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//private Employee employee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}
/*
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
*/
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressDetails=" + addressDetails + "]";
	}

	

	
}
