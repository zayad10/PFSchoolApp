package com.PFSchool.SchoolApp.Staff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "student")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StaffID")
	private Integer staffID;
	
	@Column(name = "First_Name")
	@NotNull
	private String firstName;
	
	@Column(name = "Last_Name")
	@NotNull
	private String lastName;
	
	@Column(name = "Role")
	@NotNull
	private StaffRole role;
	
	@Column(name = "Department")
	@NotNull
	private Department department;
	
	public Staff() {
	}
	
	public Staff(String firstName, String lastName, StaffRole role, Department department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.department = department;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the role
	 */
	public StaffRole getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(StaffRole role) {
		this.role = role;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
}
