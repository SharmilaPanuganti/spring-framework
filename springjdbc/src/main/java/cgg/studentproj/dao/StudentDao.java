package cgg.studentproj.dao;

import cgg.studentproj.entities.Student;
import java.util.List;

public interface StudentDao {
  int saveStudent(Student s);
  int deleteStudent(int id);
  Student getStudent(int id);
  List<Student> getAllStudents();
}
