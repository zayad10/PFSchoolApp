package com.PFSchool.SchoolApp.TeacherModule;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.PFSchool.SchoolApp.Student.Student;
import com.PFSchool.SchoolApp.Module.Module;
import com.PFSchool.SchoolApp.Staff.Staff;

@Entity
@Table(name = "teacher_module")
public class TeacherModule {

  @Id
  private Integer teacherModuleId;
  
  @ManyToOne
  private Module module;
  
  @ManyToOne
  private Staff staff;
  
  public TeacherModule() {
  }
  
  public Integer getTeacherModuleId() {
    return teacherModuleId;
  }
  
  public Module getModule() {
    return module;
  }
  
  public Staff getStaff() {
    return staff;
  }
  
  public void setTeacherModuleId(Integer id) {
   teacherModuleId = id;
  }
  
  public void setModule(Module module) {
    this.module = module;
  }
  
  public void setStaff(Staff staff) {
    this.staff = staff;
  }
}