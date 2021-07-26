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
	private Integer studentId;
	
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
	private StudentStatus Status;
	
	@Column(name = "Resit_Score")
	@Min(value = 1)
	@Max(value = 100)
	private Integer resitScore;
	
	/**
	 * Empty constructor to initialise a Student. 
	 */
	public Student() {
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
	 * @return the year
	 */
	public Integer getYear() {
		return Year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		Year = year;
	}

	/**
	 * @return the status
	 */
	public StudentStatus getStatus() {
		return Status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StudentStatus status) {
		Status = status;
	}

	/**
	 * @return the resitScore
	 */
	public Integer getResitScore() {
		return resitScore;
	}

	/**
	 * @param resitScore the resitScore to set
	 */
	public void setResitScore(Integer resitScore) {
		this.resitScore = resitScore;
	}
	
	

}
