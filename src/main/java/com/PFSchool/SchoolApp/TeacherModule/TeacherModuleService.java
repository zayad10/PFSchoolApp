package com.PFSchool.SchoolApp.TeacherModule;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherModuleService {
  
  @Autowired
  private TeacherModuleRepository teacherModuleRepository;
  
  public void addTeacherModule(TeacherModule teacherModule) {
    teacherModuleRepository.save(teacherModule);
  }
  
  public List<TeacherModule> getAllTeacherModule() {
    return teacherModuleRepository.findAll();
  }
}
