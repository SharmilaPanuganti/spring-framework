package cgg.springjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
      JavaConfig.class
    );
    // Person p = context.getBean("personbean", Person.class);
    Person p = context.getBean("p1", Person.class);
    p.study();
  }
}
