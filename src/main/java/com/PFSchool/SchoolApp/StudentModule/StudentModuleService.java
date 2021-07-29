package com.PFSchool.SchoolApp.StudentModule;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentModuleService {
  
  @Autowired
  private StudentModuleRepository studentModuleRepository;

  public void addStudentModule(StudentModule studentModule) {
    studentModuleRepository.save(studentModule);
  }
  
  public List<StudentModule> getAllStudentModules() {
    return studentModuleRepository.findAll();
  }
}
