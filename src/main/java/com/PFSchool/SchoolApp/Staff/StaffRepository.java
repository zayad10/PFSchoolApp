package com.PFSchool.SchoolApp.Staff;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
	
	public List<Staff> findByDepartment(Department dept);
	
	public List<Staff> findByRole(StaffRole role);
	
}
