package cgg.latestorm;

import cgg.latestorm.config.AppConfig;
import cgg.latestorm.dao.StudentDao;
import cgg.latestorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
      AppConfig.class
    );
    StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    Student student = new Student(1, "sharmila", "drm");
    studentDao.saveStudent(student);
  }
}
