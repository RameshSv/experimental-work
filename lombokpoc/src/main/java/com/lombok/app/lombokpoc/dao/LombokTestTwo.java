package com.lombok.app.lombokpoc.dao;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.val;
import lombok.var;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class LombokTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEmployess();

	}

	private static void printEmployess() {
		// TODO Auto-generated method stub
		final val empList = new ArrayList<EmployeeL>();
		EmployeeL emp =  new EmployeeL(1, "Ramesh", "S", "Hyd", "TS", "500049");
		empList.add(emp);
		log.debug("Print employee details ");
		empList.stream().forEach(e -> log.info("with lombok => "+e.toString()));
		
		var empMap =  new HashMap<String, String>();
		
	}

}
