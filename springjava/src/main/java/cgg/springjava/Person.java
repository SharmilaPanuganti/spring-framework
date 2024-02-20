package cgg.springjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component("personbean")
public class Person {

  //   @Autowired
  private Samosa snack;

  public Person() {}

  public Person(Samosa snack) {
    this.snack = snack;
  }

  public Samosa getSnack() {
    return snack;
  }

  public void setSnack(Samosa snack) {
    this.snack = snack;
  }

  public void study() {
    System.out.println("Student is reading book");
    snack.display();
  }
}
