package com.PFSchool.SchoolApp.Staff;

public enum Department {
	MATHS("Maths"),
	ENGLISH("English"),
	SCIENCE("SCIENCE");
	
	private String department;
	
	private Department(String dept) {
		this.department = dept;
	}
	
	/**
	 * Gets the department represented as a string.
	 * 
	 * 	
	 * @return string department
	 */
	@Override
	public String toString() {
		return department;
	}
}
