package com.PFSchool.SchoolApp.TeacherModule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherModuleRepository extends JpaRepository<TeacherModule, Integer> {
 
}
