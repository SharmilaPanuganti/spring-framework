package cgg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

  //   @RequestMapping("/one")
  //   public String redirect() {
  //     System.out.println("First handler");

  //     // return "redirect:/two";

  //     return "redirect:https://www.google.com/";
  //   }
  @RequestMapping("/one")
  public RedirectView redirect() {
    System.out.println("First handler");

    RedirectView redirectView = new RedirectView();

    redirectView.setUrl("two");

    return redirectView;
  }

  @RequestMapping("/two")
  public String redirected() {
    System.out.println("redirected to second");
    return "register";
  }
}
