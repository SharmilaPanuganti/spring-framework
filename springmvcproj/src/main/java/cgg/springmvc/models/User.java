package cgg.springmvc.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user1")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
  private int Id;

  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  private String user_name;
  private String email;
  private String password;

  public User() {}

  public User(String user_name, String email, String password) {
    this.user_name = user_name;
    this.email = email;
    this.password = password;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return (
      "User [user_name=" +
      user_name +
      ", email=" +
      email +
      ", password=" +
      password +
      ",id= " +
      Id +
      "]"
    );
  }
}
