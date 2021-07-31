package com.PFSchool.SchoolApp.Staff;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository staffRepository;
	
	public List<Staff> getAllStaff() {
		return staffRepository.findAll();
	}
	
	public List<Staff> getAllTeachers() {
		List<Staff> output = new ArrayList<>();
		StaffRole teacher = StaffRole.TEACHER;
	    for(Staff cur : getAllStaff()) {
	    	if(cur.getRole().equals(teacher)) {
	    		output.add(cur);
	    		}
	    	}
	    return output;
	}
}
