package com.PFSchool.SchoolApp.Staff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "student")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StaffID")
	private Integer staffID'
	
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
}
