package cgg.latestorm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_spring")
public class Student {

  @Id
  private int id;

  public Student(int id, String name, String city) {
    this.id = id;
    this.name = name;
    this.city = city;
  }

  private String name;
  private String city;

  public Student() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
