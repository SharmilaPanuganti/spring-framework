package cgg.studentproj.jdbcclient.entities;

public class User {

  private int id;
  private String name;
  private String about;

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

  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", about=" + about + "]";
  }
}
