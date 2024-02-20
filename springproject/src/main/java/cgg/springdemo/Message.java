package cgg.springdemo;

import org.springframework.stereotype.Component;

@Component("msg")
public class Message {

  private int id;
  private String msg;

  public Message() {}

  public Message(int id, String msg) {
    this.id = id;
    this.msg = msg;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
