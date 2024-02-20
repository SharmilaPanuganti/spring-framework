package cgg.springorm;

import cgg.springorm.config.AppConfig;
import cgg.springorm.dao.StudentDao;
import cgg.springorm.entities.Student;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    // ApplicationContext context = new ClassPathXmlApplicationContext(
    //   "spring.xml"
    // );
    ApplicationContext context = new AnnotationConfigApplicationContext(
      AppConfig.class
    );
    StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    Student student = new Student(2, "Sai", "DRM");

    // int res = studentDao.saveStudent(student);
    // System.out.println("Record inserted");
    // studentDao.updateStudent(student);
    // studentDao.deleteStudent(1);
    // Student st = studentDao.getStudentById(3);
    // System.out.println(st);
    List<Student> allStudents = studentDao.getAllStudents();
    allStudents.forEach(System.out::println);
  }
}
