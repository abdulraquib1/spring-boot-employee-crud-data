package com.raq.springboot.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raq.springboot.employee.exception.EmployeeNotFoundException;
import com.raq.springboot.employee.model.Employee;
import com.raq.springboot.employee.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
 //RequestMapping("employee")
@Api(tags = "Employee API", value = " for create, update and delete operations")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET, path = "/employees")
	@ApiOperation(value = "get list of all employees created")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/employees/{id}")
	@ApiOperation(value = "get employee details for given id")
	public Employee getEmployee(@PathVariable String id) {
		Employee employee = employeeService.getEmployee(Integer.parseInt(id));
		if (employee == null) {
			throw new EmployeeNotFoundException("EmpId " + id);
		}
		return employee;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	@ApiOperation(value = "create one or more employees")
	public void addEmployees(@RequestBody Employee[] employees) {

		for (Employee employee : employees) {
			System.out.println("adding employee " + employee);
			employeeService.addEmployee(employee);
		}
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	@ApiOperation(value = "update employee details for a given id")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		employeeService.updateEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	@ApiOperation(value = "remove the employee for the input id")
	public void removeEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(Integer.parseInt(id));
	}

}
