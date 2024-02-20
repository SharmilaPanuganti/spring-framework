package com.assignment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int todoId;

  public int getTodoId() {
    return todoId;
  }

  public void setTodoId(int todoId) {
    this.todoId = todoId;
  }

  private String todoTitle;

  private String todoContent;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date todoDate;

  public Todo() {}

  public Todo(String todoTitle, String todoContent, Date todoDate) {
    super();
    this.todoTitle = todoTitle;
    this.todoContent = todoContent;
    this.todoDate = todoDate;
  }

  public String getTodoTitle() {
    return todoTitle;
  }

  public void setTodoTitle(String todoTitle) {
    this.todoTitle = todoTitle;
  }

  public String getTodoContent() {
    return todoContent;
  }

  public void setTodoContent(String todoContent) {
    this.todoContent = todoContent;
  }

  public Date getTodoDate() {
    return todoDate;
  }

  public void setTodoDate(Date todoDate) {
    this.todoDate = todoDate;
  }

  @Override
  public String toString() {
    return (
      "Todo [todoTitle=" +
      todoTitle +
      ", todoContent=" +
      todoContent +
      ", todoDate=" +
      todoDate +
      "]"
    );
  }
}
