package com.PFSchool.SchoolApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
  
  @RequestMapping("/")
  public String index() {
    return "LandingPage";
  }
  
  @RequestMapping("/student-dashboard")
  public String studentDashboard() {
    return "StudentDashboard";
  }
}
