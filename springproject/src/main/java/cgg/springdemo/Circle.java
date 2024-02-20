package cgg.springdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import jakarta.annotation.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// import org.springframework.beans.factory.annotation.Required;
@Component
@Resources(value = { @Resource(name = "pntB") })
public class Circle implements Shape {

  private Point center;

  public Circle() {}

  public Circle(Point center) {
    this.center = center;
  }

  @Override
  public void draw() {
    System.out.println(
      "Circle is created with center point:(" +
      center.getX() +
      "," +
      center.getY() +
      ")"
    );
  }

  public Point getCenter() {
    return center;
  }

  @Autowired
  public void setCenter(Point center) {
    this.center = center;
  }

  @PostConstruct
  public void init() {
    System.out.println("Circle initialized");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Circle destroying...");
  }
}
