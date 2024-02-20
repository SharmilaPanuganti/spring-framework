package cgg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

  @GetMapping("/search")
  public String search() {
    System.out.println("Search control");
    return "home";
  }

  @PostMapping("/query")
  public String query(@RequestParam("query") String query) {
    String urlString = "https://www.google.com/search?q=" + query;
    return "redirect:" + urlString;
  }
}
