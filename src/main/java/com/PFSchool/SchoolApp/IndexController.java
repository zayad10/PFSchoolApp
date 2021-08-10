package com.PFSchool.SchoolApp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.PFSchool.SchoolApp.Module.Module;
import com.PFSchool.SchoolApp.StudentModule.StudentModuleService;
import com.PFSchool.SchoolApp.TeacherModule.TeacherModuleService;

@Controller
public class IndexController {
  
  @Autowired
  private StudentModuleService studentModuleService;
  
  @Autowired
  private TeacherModuleService teacherModuleService;
  
  @RequestMapping("/")
  public String index() {
    return "LandingPage";
  }
  
//  @RequestMapping("/get-modules-for-student/{studentId}")
//  public String getStudentModules(@PathVariable Integer studentId, ModelMap model) {
//    List<Module> modules = studentModuleService.getModulesForStudent(studentId);
//    model.put("modules", modules);
//    return "StudentDashboard";
//  }

  @RequestMapping("/student-dashboard")
  public String studentDashboard() {
    return "StudentDashboard";
  }
  
//  @RequestMapping("/get-modules-for-staff/{staffId}")
//  public String getStaffModules(@PathVariable Integer staffId, ModelMap model) {
//    List<Module> modules = teacherModuleService.getModuleForStaff(staffId);
//    model.put("modules", modules);
//    return "StudentDashboard";
//  }
}
