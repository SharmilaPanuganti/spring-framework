package cgg.springorm.dao;

import cgg.springorm.entities.Student;
import java.util.List;

public interface StudentDao {
  int saveStudent(Student s);
  void updateStudent(Student s);
  void deleteStudent(int id);
  Student getStudentById(int id);
  List<Student> getAllStudents();
}
