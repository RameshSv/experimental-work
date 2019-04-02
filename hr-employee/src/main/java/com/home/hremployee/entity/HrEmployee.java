package com.home.hremployee.entity;

import java.util.List;

import javax.persistence.Entity;

import com.home.employee.cons.EmployeeType;
import com.home.employee.entity.Employee;

@Entity
public class HrEmployee extends Employee {
	
	private String hrSalry;

	public String getHrSalry() {
		return hrSalry;
	}

	@Override
	public String toString() {
		return "HrEmployee [hrSalry=" + hrSalry + "]";
	}

	public void setHrSalry(String hrSalry) {
		this.hrSalry = hrSalry;
	}

	public HrEmployee(Long id, String name, String city, List<EmployeeType> employeeTypeList) {
		super(id, name, city, employeeTypeList);
		// TODO Auto-generated constructor stub
	}
	

}
