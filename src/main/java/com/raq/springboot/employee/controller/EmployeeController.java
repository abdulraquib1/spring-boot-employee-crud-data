package com.raq.springboot.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raq.springboot.employee.exception.EmployeeNotFoundException;
import com.raq.springboot.employee.model.Employee;
import com.raq.springboot.employee.service.EmployeeService;

//Todo : Consume a collection of Employees from the post request for create 

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET, path = "/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/employees/{id}")
	
	public Employee getEmployee(@PathVariable String id) {
		
		Employee employee = employeeService.getEmployee(Integer.parseInt(id));
		
		if(employee == null) {
			
			throw new EmployeeNotFoundException("EmpId " + id);
		}
		
		return employee;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addEmployees(@RequestBody Employee[] employees) {

		// Arrays.asList(employees).forEach(employeeService::addEmployee);

		for (Employee employee : employees) {
			System.out.println("adding employee " + employee);
			employeeService.addEmployee(employee);
		}
		// employeeService.addEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		employeeService.updateEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public void addEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(Integer.parseInt(id));
	}

}
