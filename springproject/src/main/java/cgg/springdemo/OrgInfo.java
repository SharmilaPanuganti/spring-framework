package cgg.springdemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class OrgInfo {

  private String[] namesarray = new String[2];
  private List<String> empList;
  private Set<Integer> empIdset;
  private Map<Integer, Point> pointMap;
  private Properties info;

  public Properties getInfo() {
    return info;
  }

  public void setInfo(Properties info) {
    this.info = info;
  }

  public OrgInfo() {}

  public OrgInfo(
    String[] namesarray,
    List<String> empList,
    Set<Integer> empIdset
  ) {
    this.namesarray = namesarray;
    this.empList = empList;
    this.empIdset = empIdset;
  }

  public String[] getNamesarray() {
    return namesarray;
  }

  public void setNamesarray(String[] namesarray) {
    this.namesarray = namesarray;
  }

  public List<String> getEmpList() {
    return empList;
  }

  public void setEmpList(List<String> empList) {
    this.empList = empList;
  }

  public Set<Integer> getEmpIdset() {
    return empIdset;
  }

  public void setEmpIdset(Set<Integer> empIdset) {
    this.empIdset = empIdset;
  }

  public void display() {
    for (String emp : empList) {
      System.out.println(emp);
    }
    for (String name : namesarray) {
      System.out.println(name);
    }
    for (Integer integer : empIdset) {
      System.out.println(integer);
    }
  }

  public Map<Integer, Point> getPointMap() {
    return pointMap;
  }

  public void setPointMap(Map<Integer, Point> pointMap) {
    this.pointMap = pointMap;
  }
}
