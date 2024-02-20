package com.assignment.controllers;

import com.assignment.dao.TodoDao;
import com.assignment.entities.Todo;
import jakarta.servlet.ServletContext;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

  // @Autowired
  // ServletContext context;

  @Autowired
  TodoDao todoDao;

  @RequestMapping("/home")
  @Transactional
  public String Home(Model m) {
    String str = "home";
    m.addAttribute("page", str);
    List<Todo> list = this.todoDao.getAll();
    m.addAttribute("todos", list);
    return "home";
  }

  @RequestMapping("/add")
  public String addTodo(Model m) {
    Todo t = new Todo();
    m.addAttribute("page", "add");
    m.addAttribute("todo", t);
    return "home";
  }

  @RequestMapping(value = "/saveTodo", method = RequestMethod.POST)
  @Transactional
  public String saveTodo(@ModelAttribute("todo") Todo t, Model m) {
    System.out.println(t);
    this.todoDao.save(t);
    m.addAttribute("page", "home");
    List<Todo> list = this.todoDao.getAll();
    m.addAttribute("todos", list);
    m.addAttribute("msg", "successfully added..");
    return "home";
  }
}
