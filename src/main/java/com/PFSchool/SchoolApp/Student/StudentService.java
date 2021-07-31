package com.PFSchool.SchoolApp.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PFSchool.SchoolApp.Staff.Department;
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
	
	public List<Student> getByStatus(StudentStatus status) {
		List<Student> output = new ArrayList<>();
	    for(Student cur : getAllStudents()) {
	    	if(cur.getStatus().equals(status)) {
	    		output.add(cur);
	    		}
	    	}
	    return output;
	}
}
