package com.PFSchool.SchoolApp.TeacherModule;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.PFSchool.SchoolApp.Module.Module;
import com.PFSchool.SchoolApp.Staff.Staff;

@Repository
public interface TeacherModuleRepository extends JpaRepository<TeacherModule, Integer> {
 
  public List<TeacherModule> findByModule(Module module);
  
  public List<TeacherModule> findByStaff(Staff staff);
  
}
