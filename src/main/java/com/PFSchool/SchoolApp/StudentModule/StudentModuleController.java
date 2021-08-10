package com.PFSchool.SchoolApp.StudentModule;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.PFSchool.SchoolApp.Module.Module;

@RestController
public class StudentModuleController {
  
  @Autowired
  private StudentModuleService studentModuleService;
  
  @RequestMapping("get-modules-for-student/{studentId}")
  public List<Module> getStudentModules(@PathVariable Integer studentId) {
    return studentModuleService.getModulesForStudent(studentId);
  }
}
