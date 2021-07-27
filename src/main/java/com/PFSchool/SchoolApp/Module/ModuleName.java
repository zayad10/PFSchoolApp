package com.PFSchool.SchoolApp.Module;

public enum ModuleName {

	MATHS("Maths"),
	ENGLISH("English"),
	SCIENCE("Science");
	
	private String name;
	
	private ModuleName(String moduleName) {
		name = moduleName;
	}
	
	/**
	 * Gets the module name represented as a string.
	 * 
	 * 	
	 * @return string module name.
	 */
	@Override
	public String toString() {
		return name;
	}
}
