package com.lombok.app.lombokpoc.dao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokTest {
	
	//logger for slf4j
//	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(LombokTest.class);

	public static void main(String[] args) {
		// Without lombok
		Employee em = new Employee(1, "Ram", "S", "Banglore", "KA", "560060");
		System.out.println(em.toString());
		// Lombok with Args constructor
		EmployeeL eml1 = new EmployeeL(2, "Raj", "D", "Chennai", "TN", "600006");
		System.out.println(eml1.toString());
		// Lombok with setter and getter
		EmployeeL eml2 = new EmployeeL();
		eml2.setId(3);
		eml2.setEFirstName("James");
		eml2.setELastName("JJ");
		eml2.setEState("CA");
		eml2.setEState("Sacramento");
		eml2.setECity(null);
		log.info("with lombok => "+eml2.toString());
//		logger.info("without lombok "+eml2.toString());
		
		

	}

}
