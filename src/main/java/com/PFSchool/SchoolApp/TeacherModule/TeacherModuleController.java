package com.PFSchool.SchoolApp.TeacherModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherModuleController {
  
  @Autowired
  private TeacherModuleService teacherModuleService;

}
