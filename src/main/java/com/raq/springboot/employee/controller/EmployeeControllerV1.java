package com.raq.springboot.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raq.springboot.employee.model.Employee;
import com.raq.springboot.employee.service.EmployeeService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("employee/v1")
@Api(tags = "Employee API V1", value = " for create, update and delete operations", description = "")
public class EmployeeControllerV1{

	
	@Autowired
	private EmployeeService employeeService;

	
	@RequestMapping(method = RequestMethod.GET, value="/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	
	/*
	@RequestMapping(method = RequestMethod.GET, value="/employees/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(Integer.parseInt(id));
		
	}
	*/

	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	/*
	@RequestMapping(method = RequestMethod.PUT, value="/employees/{id}")
	public void addEmployee(@RequestBody Employee employee, @PathVariable String id) {
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}")
	public void addEmployee( @PathVariable String id) {
		employeeService.deleteEmployee(Integer.parseInt(id));
	}
	*/
	
}
