package com.raq.springboot.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.raq.springboot.employee.model.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer>{

}
