package com.lombok.app.lombokpoc.dao;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApplicationL {
	
	private String pendingAppId;
	private String applicationMode; 
	private String applicationStatus; 
	private String eligibilityStatus; 
	private String enrollmentStatus; 
	private String enrollmentYear;
	private String subsidizedApplication;
	private String agreeToConsent;
	private String hearExchangeCode;
	private String zipCode;
	
	//displayed in page
	private String applicationId;
	
	 
	private String sourcePersonId;
	
	private Boolean isAdmin;
	private String isRIDPCompleted;
	private String isFarsRequired;
	 
	private String dSHReferenceNumber;
	
	 
	private String sspPersonId;
	
	//displayed in page
	private String caseId;
	
	private String primaryContactName;
	private String sourceActiveRole;
	private boolean isGIUser;
	private String newAppInd;
	
	 
	private String otherAccountRecordId;
	
	private Boolean agentAndAppIndNew;
	
	 
	private String designatePersonId;
	
	 
	private String deDesignatePersonId;
	
	private String isAgentSEPEnable="false";		
	private String appSubmissionType;
	private String applicationDate;


}
