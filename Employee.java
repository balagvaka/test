package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int employee_id;
	@Column(name="employee_name")
	String name;
	@Column(name="employee_sal")
	float salary;
	@Column(name="dept_num")
	int deptnum;
	
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getDeptnum() {
		return deptnum;
	}
	public void setDeptnum(int deptnum) {
		this.deptnum = deptnum;
	}
	
}
