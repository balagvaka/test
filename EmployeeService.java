package com.employee.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	@Transactional
	public Map<String,String> addEmployee(Employee employee);
	public Map<String,String> deleteById(int theId);

}
