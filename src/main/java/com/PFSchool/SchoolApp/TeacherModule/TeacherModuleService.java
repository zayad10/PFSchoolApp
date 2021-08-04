package com.PFSchool.SchoolApp.TeacherModule;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PFSchool.SchoolApp.Staff.Staff;
import com.PFSchool.SchoolApp.Module.Module;

/**
 * Service class for TeacherModuleService
 * 
 * @author James
 */
@Service
public class TeacherModuleService {
  
  @Autowired
  private TeacherModuleRepository teacherModuleRepository;
  
  @Autowired
  private TeacherModuleService teacherService;
  
  /**
   * Add relation between a teacher and a module.
   * 
   * @param teacherModule
   */
  public void addTeacherModule(TeacherModule teacherModule) {
    teacherModuleRepository.save(teacherModule);
  }
  
  /**
   * Gets all teacher modules.
   * 
   * @return list of teacher modules
   */
  public List<TeacherModule> getAllTeacherModule() {
    return teacherModuleRepository.findAll();
  }
  
  /**
   * Gets list of staff teaching a module.
   * 
   * @param module staff teach
   * 
   * @return list of staff teaching a cetain module
   */
  public List<Staff> getStaffForModule(Module module) {
    List<TeacherModule> teacherModules = teacherModuleRepository.findByModule(module);
    List<Staff> modules = new ArrayList<Staff>();
    
    for (TeacherModule teacherModule : teacherModules) {
      modules.add(teacherModule.getStaff());
    }
    
    return modules;
  }
}
