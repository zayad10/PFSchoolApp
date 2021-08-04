package com.PFSchool.SchoolApp.TeacherModule;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PFSchool.SchoolApp.Staff.Staff;
import com.PFSchool.SchoolApp.Module.Module;

@Service
public class TeacherModuleService {
  
  @Autowired
  private TeacherModuleRepository teacherModuleRepository;
  
  @Autowired
  private TeacherModuleService teacherService;
  
  public void addTeacherModule(TeacherModule teacherModule) {
    teacherModuleRepository.save(teacherModule);
  }
  
  public List<TeacherModule> getAllTeacherModule() {
    return teacherModuleRepository.findAll();
  }
  
  public List<Staff> getStaffForModule(Module module) {
    List<TeacherModule> teacherModules = teacherModuleRepository.findByModule(module);
    List<Staff> modules = new ArrayList<Staff>();
    
    for (TeacherModule teacherModule : teacherModules) {
      modules.add(teacherModule.getTeacher());
    }
    
    return modules;
  }
}
