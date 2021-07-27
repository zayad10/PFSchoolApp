package com.PFSchool.SchoolApp.StudentModule;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.PFSchool.SchoolApp.Module.Module;
import com.PFSchool.SchoolApp.Student.Student;

@Entity
@Table(name = "student_module")
public class StudentModule {
  
  @Id
  @ManyToOne
  private Module module;
  
  @Id
  @ManyToOne
  private Student student;
  
  public StudentModule() {
  }
  
  public Module getModule() {
    return module;
  }
  
  public Student getStudent() {
    return student;
  }
  
  public void setModule(Module module) {
    this.module = module;
  }
  
  public void setStudent(Student student) {
    this.student = student;
  }
}
