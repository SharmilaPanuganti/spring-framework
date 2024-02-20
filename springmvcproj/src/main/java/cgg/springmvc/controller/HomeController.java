package cgg.springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

  // @RequestMapping(path = "/home", method = RequestMethod.GET)
  @GetMapping("/home")
  public String home(Model model) {
    model.addAttribute("name", "Sharmila");
    model.addAttribute("id", 45);
    List<String> courses = new ArrayList<>();
    courses.add("java");
    courses.add("python");
    courses.add("Spring boot");
    model.addAttribute("courses", courses);
    System.out.println("home url");
    return "index";
  }

  @RequestMapping(path = "/about")
  public String about() {
    System.out.println("About page is opened");
    return "about";
  }

  @RequestMapping(path = "/help")
  public ModelAndView help() {
    ModelAndView modelAndView = new ModelAndView();
    System.out.println("Help url");
    modelAndView.addObject("name", "Model and View");
    modelAndView.addObject("Employees", 25);
    modelAndView.addObject("time", LocalDateTime.now());
    List<Integer> marks = new ArrayList<>();
    marks.add(90);
    marks.add(89);
    marks.add(78);
    modelAndView.setViewName("help");
    modelAndView.addObject("marks", marks);
    return modelAndView;
  }
}
