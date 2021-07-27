package com.PFSchool.SchoolApp.Staff;

public enum StaffRole {
	TEACHER("Teacher"),
	HEADTEACHER("Head Teacher");
	
	private String role;
	
	private StaffRole(String StaffRole) {
		this.role = StaffRole;
	}
	
	/**
	 * Gets the Staff Role represented as a string.
	 * 
	 * 	
	 * @return string role
	 */
	@Override
	public String toString() {
		return role;
	}
}
