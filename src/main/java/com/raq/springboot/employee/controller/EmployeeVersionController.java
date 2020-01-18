package com.raq.springboot.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raq.springboot.dto.EmployeeV1;
import com.raq.springboot.dto.EmployeeV2;

@RestController
public class EmployeeVersionController {
	
	
	//Versioning strategy 1 using simple URI mapping
	//http://localhost:8080/v1/employee
	//http://localhost:8080/v1/employee
	@GetMapping("v1/employee")
	public EmployeeV1 employeeV1() {
		return new EmployeeV1(1,"Tom",25,60000.00);
	}


	@GetMapping("v2/employee")
	public EmployeeV2 employeeV2() {
		return new EmployeeV2(1,"Dave",30,90000.00);
	}
	
	//Versioning strategy 2 using param
	//http://localhost:8080/employee/param?version=1
	//http://localhost:8080/employee/param?version=2
	@GetMapping(value = "employee/param" , params="version=1")
	public EmployeeV1 paramV1() {
		return new EmployeeV1(1,"Tom",25,60000.00);
	}

	@GetMapping(value = "employee/param" , params="version=2")
	public EmployeeV2 paramV2() {
		return new EmployeeV2(1,"Dave",30,90000.00);
	}

	
	//Versioning strategy 3 using headers
	//http://localhost:8080/employee/header
	@GetMapping(value = "employee/header" , headers="X-API-VERSION=1")
	public EmployeeV1 headerV1() {
		return new EmployeeV1(1,"Tom",25,60000.00);
	}


	@GetMapping(value = "employee/header" , headers="X-API-VERSION=2")
	public EmployeeV2 headerV2() {
		return new EmployeeV2(1,"Dave",30,90000.00);
	}
	
	//MIME Type versioning
	//Versioning strategy 4 using content-negotiations or accept versioning, also known as MIME Type versioning
	//http://localhost:8080/employee/header
	@GetMapping(value = "employee/header" , produces="application/com.raq.springboot-v1+json")
	public EmployeeV1 producesV1() {
		return new EmployeeV1(1,"Tom",25,60000.00);
	}


	@GetMapping(value = "employee/header" , produces="application/com.raq.springboot-v2+json")
	public EmployeeV2 producesV2() {
		return new EmployeeV2(1,"Dave",30,90000.00);
	}

}
