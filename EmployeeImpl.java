package com.employee.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.Employee;
import com.employee.repo.EmployeeRepository;
@Service
public class EmployeeImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return this.employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Map<String, String> addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp=this.employeeRepository.save(employee);
		HashMap<String,String> response= new HashMap<String,String>();
		if(emp!=null)
		{
			response.put("status", "0");
			response.put("Message","New Employee Added Successfully");
		}
		else
		{
			response.put("status","1");
			response.put("message", "can not add new employee");
		}
		
		return response;
	}

	@Override
	@Transactional
	public Map<String, String> deleteById(int theId) {
		this.employeeRepository.deleteById(theId);

		HashMap<String,String> response= new HashMap<String,String>();

		response.put("status", "0");
		response.put("message","Deleted Employee Successfully");
		return response;
		// TODO Auto-generated method stub
	
	}

}
