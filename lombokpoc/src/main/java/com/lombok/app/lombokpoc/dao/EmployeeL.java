package com.lombok.app.lombokpoc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeL {
	
	private long id;
	@NonNull
	private String eFirstName;
	private String eLastName;
	private String eCity;
	private String eState;
	private String eZip;

}
