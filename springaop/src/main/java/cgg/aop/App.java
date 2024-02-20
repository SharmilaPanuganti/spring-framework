package cgg.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
      AppCofig.class
    );
    ShapeService s = context.getBean(ShapeService.class);
    System.out.println(s.getCircle().getName());
    System.out.println(s.getTriangle().getName());
  }
}
