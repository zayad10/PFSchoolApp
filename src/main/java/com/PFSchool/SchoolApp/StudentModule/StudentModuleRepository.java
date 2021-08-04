package com.PFSchool.SchoolApp.StudentModule;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.PFSchool.SchoolApp.Student.Student;
import com.PFSchool.SchoolApp.Module.Module;

@Repository
public interface StudentModuleRepository extends JpaRepository<StudentModule, Integer> {

  public List<StudentModule> findByStudent(Student student);
  
  public List<StudentModule> findByModule(Module module);
  
}
