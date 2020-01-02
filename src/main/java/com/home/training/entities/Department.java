package com.home.training.entities;
public class Department {
	
	public Integer DEPARTMENT_ID; 
	public String DEPARTMENT_NAME; 
	public Integer MANAGER_ID;
	public Integer LOCATION_ID;
	
	public Department() {}
	
	public Department(Integer dEPARTMENT_ID, String dEPARTMENT_NAME, Integer mANAGER_ID, Integer lOCATION_ID) {
		super();
		DEPARTMENT_ID = dEPARTMENT_ID;
		DEPARTMENT_NAME = dEPARTMENT_NAME;
		MANAGER_ID = mANAGER_ID;
		LOCATION_ID = lOCATION_ID;
	}
	public Integer getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	public void setDEPARTMENT_ID(Integer dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	public String getDEPARTMENT_NAME() {
		return DEPARTMENT_NAME;
	}
	public void setDEPARTMENT_NAME(String dEPARTMENT_NAME) {
		DEPARTMENT_NAME = dEPARTMENT_NAME;
	}
	public Integer getMANAGER_ID() {
		return MANAGER_ID;
	}
	public void setMANAGER_ID(Integer mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}
	public Integer getLOCATION_ID() {
		return LOCATION_ID;
	}
	public void setLOCATION_ID(Integer lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}

	@Override
	public String toString() {
		return "Department [DEPARTMENT_ID=" + DEPARTMENT_ID + ", DEPARTMENT_NAME=" + DEPARTMENT_NAME + ", MANAGER_ID="
				+ MANAGER_ID + ", LOCATION_ID=" + LOCATION_ID + "]";
	}
	
	
}


