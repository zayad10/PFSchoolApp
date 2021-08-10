package com.PFSchool.SchoolApp.StudentModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentModuleController {
  
  @Autowired
  private StudentModuleService studentModuleService;

}
