package com.PFSchool.SchoolApp.StudentModule;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PFSchool.SchoolApp.Student.Student;
import com.PFSchool.SchoolApp.Student.StudentService;
import com.PFSchool.SchoolApp.Module.Module;

/**
 * Service class for student relation with a module
 * 
 * @author James
 */
@Service
public class StudentModuleService {
  
  @Autowired
  private StudentModuleRepository studentModuleRepository;
  
  @Autowired
  private StudentService studentService;

  /**
   * Add student to a module.
   * 
   * @param studentModule
   */
  public void addStudentModule(StudentModule studentModule) {
    studentModuleRepository.save(studentModule);
  }
  
  /**
   * Gets list of all student module relations.
   * 
   * @return list of student modules
   */
  public List<StudentModule> getAllStudentModules() {
    return studentModuleRepository.findAll();
  }
  
  /**
   * Gets list of modules taken by a student.
   * 
   * @param student taking the modules
   * 
   * @return modules taken by student
   */
  public List<Module> getModulesForStudent(Integer studentId) {
    Student student = studentService.getStudentById(studentId);
    List<StudentModule> studentModules = studentModuleRepository.findByStudent(student);
    List<Module> modules = new ArrayList<Module>();
    
    for (StudentModule studentModule : studentModules) {
      modules.add(studentModule.getModule());
    }
    
    return modules;
  }
  
  /**
   * Gets list of students taking a module.
   * 
   * @param module students are taking
   * 
   * @return list of students taking a module
   */
  public List<Student> getStudentForModule(Module module) {
    List<StudentModule> studentModules = studentModuleRepository.findByModule(module);
    List<Student> students = new ArrayList<Student>();
    
    for (StudentModule studentModule : studentModules) {
      students.add(studentModule.getStudent());
    }
    
    return students;
  }
}
