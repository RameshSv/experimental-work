package com.home.employee.cons;

public enum EmployeeType {

	HR("hr"), FINANCE("finance"), IT("it");

	private String type;

	public String getType() {
		return type;
	}

	EmployeeType(String type) {
		this.type = type;
	}
}
