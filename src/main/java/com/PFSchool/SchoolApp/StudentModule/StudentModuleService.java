package com.PFSchool.SchoolApp.StudentModule;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for student relation with a module
 * 
 * @author James
 */
@Service
public class StudentModuleService {
  
  @Autowired
  private StudentModuleRepository studentModuleRepository;

  /**
   * Add student to a module.
   * 
   * @param studentModule
   */
  public void addStudentModule(StudentModule studentModule) {
    studentModuleRepository.save(studentModule);
  }
  
  /**
   * Gets list of all student module relations.
   * 
   * @return list of student modules
   */
  public List<StudentModule> getAllStudentModules() {
    return studentModuleRepository.findAll();
  }
}
