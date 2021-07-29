package com.PFSchool.SchoolApp.StudentModule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentModuleRepository extends JpaRepository<StudentModule, Integer> {

}
