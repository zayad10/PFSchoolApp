package com.PFSchool.SchoolApp.TeacherModule;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.PFSchool.SchoolApp.Module.Module;

@RestController
public class TeacherModuleController {
  
  @Autowired
  private TeacherModuleService teacherModuleService;
  
  @RequestMapping("get-modules-for-staff/{staffId}")
  public List<Module> getModulesForStaff(@PathVariable Integer staffId) {
    return teacherModuleService.getModuleForStaff(staffId);
  }
}
