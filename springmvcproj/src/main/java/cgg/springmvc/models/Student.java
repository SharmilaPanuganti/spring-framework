package cgg.springmvc.models;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Student {

  private long id;
  private String name;

  // @DateTimeFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(iso = ISO.DATE)
  private Date dob;

  private List<String> courses;
  private String gender;
  private String type;
  private Address address;

  public Student(
    long id,
    String name,
    Date dob,
    List<String> courses,
    String gender,
    String type,
    Address address
  ) {
    this.id = id;
    this.name = name;
    this.dob = dob;
    this.courses = courses;
    this.gender = gender;
    this.type = type;
    this.address = address;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Student() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public List<String> getCourses() {
    return courses;
  }

  public void setCourses(List<String> courses) {
    this.courses = courses;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return (
      "Student [id=" +
      id +
      ", name=" +
      name +
      ", dob=" +
      dob +
      ", courses=" +
      courses +
      ", gender=" +
      gender +
      ", type=" +
      type +
      ", address=" +
      address +
      "]"
    );
  }
}
