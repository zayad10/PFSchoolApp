package com.PFSchool.SchoolApp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.PFSchool.SchoolApp.Student.Student;
import com.PFSchool.SchoolApp.Module.Module;
import com.PFSchool.SchoolApp.Student.StudentService;
import com.PFSchool.SchoolApp.StudentModule.StudentModuleService;

@Controller
public class IndexController {
  
  @Autowired
  private StudentModuleService studentModuleService;
  
  @Autowired
  private StudentService studentService;
  
  @RequestMapping("/")
  public String index() {
    return "LandingPage";
  }
  
  @RequestMapping("get-modules-for/{studentId}")
  public String getStudentModules(@PathVariable Integer studentId, ModelMap model) {
    Student student; 
    List<Module> modules = studentModuleService.getModulesForStudent(student);
    model.put("modules", modules);
    return "";
  }

}
