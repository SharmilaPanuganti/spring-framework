package cgg.studentproj;

import cgg.studentproj.config.JdbcConfig;
import cgg.studentproj.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
      JdbcConfig.class
    );
    StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
  }
}
