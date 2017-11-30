package com.raq.springboot.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raq.springboot.employee.dao.EmployeeDAO;
import com.raq.springboot.employee.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeDAO.findAll().forEach(employees::add);
		System.out.println("EmployeeService.getEmployees() invoked " + employees );
		return employees;
	}
	
	public Employee getEmployee(int id) {
		Employee employee = employeeDAO.findOne(new Integer(id));
		System.out.println("EmployeeService.getEmployee(id) invoked " + employee );
		return employee;

	}

	public void addEmployee(Employee employee) {
		employeeDAO.save(employee);
		System.out.println("EmployeeService.addEmployee() invoked " + employee);
	}

	public void updateEmployee(Employee employee) {
		employeeDAO.save(employee);
		System.out.println("EmployeeService.updateEmployee() invoked " + employee);
		
	}

	public void deleteEmployee(int id) {
		employeeDAO.delete(new Integer(id));
		System.out.println("EmployeeService.deleteEmployee() invoked " + id);
	}

	
}
