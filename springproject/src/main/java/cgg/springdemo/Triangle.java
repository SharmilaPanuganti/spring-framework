package cgg.springdemo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape { //  InitializingBean, DisposableBean //    ApplicationContextAware, BeanNameAware, // implements

  private Point pntA;
  private Point pntB;
  private Point pntC;
  private ApplicationContext context;

  public Point getPntA() {
    return pntA;
  }

  public void setPntA(Point pntA) {
    this.pntA = pntA;
  }

  public Point getPntB() {
    return pntB;
  }

  public void setPntB(Point pntB) {
    this.pntB = pntB;
  }

  public Point getPntC() {
    return pntC;
  }

  public void setPntC(Point pntC) {
    this.pntC = pntC;
  }

  // private List<Point> points = new ArrayList<>();
  public void draw() {
    System.out.println("PointA(" + pntA.getX() + "," + pntA.getY() + ")");
    System.out.println("PointB(" + pntB.getX() + "," + pntB.getY() + ")");
    System.out.println("PointC(" + pntC.getX() + "," + pntC.getY() + ")");
  }
  // @Override
  // public void setApplicationContext(ApplicationContext applicationContext)
  //   throws BeansException {
  //   this.context = applicationContext;
  // }

  // @Override
  // public void setBeanName(String name) {
  //   System.out.println("Bean Name : " + name);
  // }

  // @Override
  // public void afterPropertiesSet() throws Exception {
  //   System.out.println("Bean is Initialized");
  // }

  // @Override
  // public void destroy() throws Exception {
  //   System.out.println("Called before destroying");
  // }

  // public void myInit() {
  //   System.out.println("My init method called");
  // }

  // public void myDestroy() {
  //   System.out.println("My destroy method called");
  // }
}
