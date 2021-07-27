package com.PFSchool.SchoolApp.Student;

public enum StudentStatus {
	
	ENROLLED("Enrolled"),
	REGISTERED("Registered"),
	FAILED("Failed");
	
	private String status;
	
	private StudentStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Gets the student status represented as a string.
	 * 
	 * 	
	 * @return string status
	 */
	@Override
	public String toString() {
		return status;
	}
}
