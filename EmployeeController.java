package com.employee.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/allemployees")
	public List<Employee> fetchAllStudents()
	{
		return this.employeeService.findAll();
	}
	
	@PostMapping("/addemployee")
	public Map<String,String> addEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
		
	}
	@GetMapping("/deleteemployee/{theId}")
	public Map<String,String> deleteById(@PathVariable int theId)
	{
		return this.employeeService.deleteById(theId);
	}
	

	
	


}
