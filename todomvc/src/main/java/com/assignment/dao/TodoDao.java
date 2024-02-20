package com.assignment.dao;

import com.assignment.entities.Todo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TodoDao {

  @Autowired
  SessionFactory factory;

  @Transactional
  public Todo save(Todo t) {
    factory.getCurrentSession().persist(t);
    return t;
  }

  public List<Todo> getAll() {
    List<Todo> todos = factory
      .getCurrentSession()
      .createQuery("from Todo", Todo.class)
      .getResultList();

    return todos;
  }
}
