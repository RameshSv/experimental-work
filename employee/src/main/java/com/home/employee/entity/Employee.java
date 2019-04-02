package com.home.employee.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.home.employee.cons.EmployeeType;

@Entity
public abstract class Employee {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String city;
	@ElementCollection
	private List<EmployeeType> employeeTypeList;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", employeeTypeList=" + employeeTypeList
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<EmployeeType> getEmployeeTypeList() {
		return employeeTypeList;
	}

	public void setEmployeeTypeList(List<EmployeeType> employeeTypeList) {
		this.employeeTypeList = employeeTypeList;
	}

	public Employee(Long id, String name, String city, List<EmployeeType> employeeTypeList) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.employeeTypeList = employeeTypeList;
	}
	
	

}
