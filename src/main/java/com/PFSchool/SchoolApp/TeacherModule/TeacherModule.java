package com.PFSchool.SchoolApp.TeacherModule;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.PFSchool.SchoolApp.Student.Student;
import com.PFSchool.SchoolApp.Module.Module;

@Entity
@Table(name = "teacher_module")
public class TeacherModule implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Id
  @ManyToOne
  private Module module;
  
  @Id
  @ManyToOne
  private Student student;
  
  public TeacherModule() {
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