package com.lombok.app.lombokpoc.dao;

public class Application {

	//pendingAppId is already encrypted in app code
	private String pendingAppId;
	private String applicationMode; // APPLY, MAINTAIN_VIEW, MAINTAIN_EDIT,MAINTAIN_NEW
	private String applicationStatus; // IN-PROGRESS, SUBMITTED, etc
	private String eligibilityStatus; // PENDING , ACTIVE , COMPLETED
	private String enrollmentStatus; // PENDING , ACTIVE , COMPLETED
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
	/**
	 * @return the pendingAppId
	 */
	public String getPendingAppId() {
		return pendingAppId;
	}

	/**
	 * @param pendingAppId
	 *            the pendingAppId to set
	 */
	public void setPendingAppId(String pendingAppId) {
		this.pendingAppId = pendingAppId;
	}

	/**
	 * @return the applicationMode
	 */
	public String getApplicationMode() {
		return applicationMode;
	}

	/**
	 * @param applicationMode
	 *            the applicationMode to set
	 */
	public void setApplicationMode(String applicationMode) {
		this.applicationMode = applicationMode;
	}

	/**
	 * @return the applicationStatus
	 */
	public String getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus
	 *            the applicationStatus to set
	 */
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * @return the eligibilityStatus
	 */
	public String getEligibilityStatus() {
		return eligibilityStatus;
	}

	/**
	 * @param eligibilityStatus
	 *            the eligibilityStatus to set
	 */
	public void setEligibilityStatus(String eligibilityStatus) {
		this.eligibilityStatus = eligibilityStatus;
	}

	/**
	 * @return the enrollmentStatus
	 */
	public String getEnrollmentStatus() {
		return enrollmentStatus;
	}

	/**
	 * @param enrollmentStatus
	 *            the enrollmentStatus to set
	 */
	public void setEnrollmentStatus(String enrollmentStatus) {
		this.enrollmentStatus = enrollmentStatus;
	}

	/**
	 * @return the enrollmentYear
	 */
	public String getEnrollmentYear() {
		return enrollmentYear;
	}

	/**
	 * @param enrollmentYear
	 *            the enrollmentYear to set
	 */
	public void setEnrollmentYear(String enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}

	/**
	 * @return the subsidizedApplication
	 */
	public String getSubsidizedApplication() {
		return subsidizedApplication;
	}

	/**
	 * @param subsidizedApplication
	 *            the subsidizedApplication to set
	 */
	public void setSubsidizedApplication(String subsidizedApplication) {
		this.subsidizedApplication = subsidizedApplication;
	}

	/**
	 * @return the agreeToConsent
	 */
	public String getAgreeToConsent() {
		return agreeToConsent;
	}

	/**
	 * @param agreeToConsent
	 *            the agreeToConsent to set
	 */
	public void setAgreeToConsent(String agreeToConsent) {
		this.agreeToConsent = agreeToConsent;
	}

	/**
	 * @return the hearExchangeCode
	 */
	public String getHearExchangeCode() {
		return hearExchangeCode;
	}

	/**
	 * @param hearExchangeCode
	 *            the hearExchangeCode to set
	 */
	public void setHearExchangeCode(String hearExchangeCode) {
		this.hearExchangeCode = hearExchangeCode;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the applicationId
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId
	 *            the applicationId to set
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * @return the sourcePersonId
	 */
	public String getSourcePersonId() {
		return sourcePersonId;
	}

	/**
	 * @param sourcePersonId the sourcePersonId to set
	 */
	public void setSourcePersonId(String sourcePersonId) {
		this.sourcePersonId = sourcePersonId;
	}

	/**
	 * @return the isAdmin
	 */
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	/**
	 * @return the isRIDPCompleted
	 */
	public String getIsRIDPCompleted() {
		return isRIDPCompleted;
	}

	/**
	 * @param isRIDPCompleted the isRIDPCompleted to set
	 */
	public void setIsRIDPCompleted(String isRIDPCompleted) {
		this.isRIDPCompleted = isRIDPCompleted;
	}

	/**
	 * @return the sspPersonId
	 */
	public String getSspPersonId() {
		return sspPersonId;
	}

	/**
	 * @param sspPersonId
	 *            the sspPersonId to set
	 */
	public void setSspPersonId(String sspPersonId) {
		this.sspPersonId = sspPersonId;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getPrimaryContactName() {
		return primaryContactName;
	}

	public void setPrimaryContactName(String primaryContactName) {
		this.primaryContactName = primaryContactName;
	}
	
	/**
	 * @return the sourceActiveRole
	 */
	public String getSourceActiveRole() {
		return sourceActiveRole;
	}

	/**
	 * @param sourceActiveRole
	 *            the sourceActiveRole to set
	 */
	public void setSourceActiveRole(String sourceActiveRole) {
		this.sourceActiveRole = sourceActiveRole;
	}

	/**
	 * @return the newAppInd
	 */
	public String getNewAppInd() {
		return newAppInd;
	}

	/**
	 * @param newAppInd
	 *            the newAppInd to set
	 */
	public void setNewAppInd(String newAppInd) {
		this.newAppInd = newAppInd;
	}

	/**
	 * @return the otherAccountRecordId
	 */
	public String getOtherAccountRecordId() {
		return otherAccountRecordId;
	}

	/**
	 * @param otherAccountRecordId
	 *            the otherAccountRecordId to set
	 */
	public void setOtherAccountRecordId(String otherAccountRecordId) {
		this.otherAccountRecordId = otherAccountRecordId;
	}
	
	/**
	 * @return the agentAndAppIndNew
	 */
	public Boolean getAgentAndAppIndNew() {
		return agentAndAppIndNew;
	}

	/**
	 * @param agentAndAppIndNew
	 *            the agentAndAppIndNew to set
	 */
	public void setAgentAndAppIndNew(Boolean agentAndAppIndNew) {
		this.agentAndAppIndNew = agentAndAppIndNew;
	}

	public String getDesignatePersonId() {
		return designatePersonId;
	}

	public void setDesignatePersonId(String designatePersonId) {
		this.designatePersonId = designatePersonId;
	}

	public String getDeDesignatePersonId() {
		return deDesignatePersonId;
	}

	public void setDeDesignatePersonId(String deDesignatePersonId) {
		this.deDesignatePersonId = deDesignatePersonId;
	}
	
	public String getIsAgentSEPEnable() {
		return isAgentSEPEnable;
	}

	public void setIsAgentSEPEnable(String isAgentSEPEnable) {
		this.isAgentSEPEnable = isAgentSEPEnable;
	}
	
		
	/**
	 * @return the appSubmissionType
	 */
	public String getAppSubmissionType() {
		return appSubmissionType;
	}

	/**
	 * @param appSubmissionType the appSubmissionType to set
	 */
	public void setAppSubmissionType(String appSubmissionType) {
		this.appSubmissionType = appSubmissionType;
	}
	
	/**
	 * @return the isFarsRequired
	 */
	public String getIsFarsRequired() {
		return isFarsRequired;
	}

	/**
	 * @param isFarsRequired
	 *            the isFarsRequired to set
	 */
	public void setIsFarsRequired(String isFarsRequired) {
		this.isFarsRequired = isFarsRequired;
	}
	
	/**
	 * @return the dSHReferenceNumber
	 */
	public String getdSHReferenceNumber() {
		return dSHReferenceNumber;
	}

	/**
	 * @param dSHReferenceNumber the dSHReferenceNumber to set
	 */
	public void setdSHReferenceNumber(String dSHReferenceNumber) {
		this.dSHReferenceNumber = dSHReferenceNumber;
	}
	
	/**
	 * @return the primContactRIDP
	 */
	

	/**
	 * @return the isGIUser
	 */
	public boolean isGIUser() {
		return isGIUser;
	}

	/**
	 * @param isGIUser
	 *            the isGIUser to set
	 */
	public void setGIUser(boolean isGIUser) {
		this.isGIUser = isGIUser;
	}

	/**
	 * @return the applicationDate
	 */
	public String getApplicationDate() {
		return applicationDate;
	}

	/**
	 * @param applicationDate the applicationDate to set
	 */
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

}