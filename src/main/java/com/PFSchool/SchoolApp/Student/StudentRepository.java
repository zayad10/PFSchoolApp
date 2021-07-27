package com.PFSchool.SchoolApp.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findByYear(Integer year);
	
	public List<Student> findByStatus(StudentStatus status);
}
