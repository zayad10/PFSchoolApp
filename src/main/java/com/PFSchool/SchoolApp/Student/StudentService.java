package com.PFSchool.SchoolApp.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PFSchool.SchoolApp.Staff.Staff;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public void addStudent(Student pupil) {
		studentRepository.save(pupil);
	}
	
	public void deleteStudentByID(Integer id) {
		studentRepository.deleteById(id);
	}
	
}
