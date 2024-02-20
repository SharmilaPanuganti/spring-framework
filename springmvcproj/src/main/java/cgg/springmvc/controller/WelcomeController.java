package cgg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

  @GetMapping("/user")
  public String showUser() {
    return "user";
  }

  @GetMapping("/welcome")
  public String welcome(@RequestParam("name") String name, Model m) {
    System.out.println("welcome handler");
    m.addAttribute("name", name);
    return "welcome";
  }
}
