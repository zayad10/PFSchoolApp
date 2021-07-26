package com.PFSchool.SchoolApp.Student;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_ID")
	private Integer itemId;
	
	@Column(name = "First_Name")
	@NotNull
	private String firstName;
	
	@Column(name = "Last_Name")
	@NotNull
	private String lastName;
	
	@Column(name = "Year")
	@Min(value = 1)
	@Max(value = 3)
	private Integer Year;
	
	@Column(name = "Status")
	@NotNull
	private String Status;
	
	@Column(name = "Resit_Score")
	@Min(value = 1)
	@Max(value = 100)
	private Integer resitScore;

}
