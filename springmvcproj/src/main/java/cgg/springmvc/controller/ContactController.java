package cgg.springmvc.controller;

import cgg.springmvc.models.User;
import cgg.springmvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

  @Autowired
  private UserService userService;

  public ContactController(UserService userService) {
    this.userService = userService;
  }

  public UserService getUserService() {
    return userService;
  }

  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/contact")
  public String contact(Model model) {
    System.out.println("Contact controller");
    model.addAttribute("Header", "Model Attribute");
    model.addAttribute("desc", "Spring framework");
    return "register";
  }

  // @RequestMapping(path = "/processForm", method = RequestMethod.POST)
  // public String processForm(
  //   @RequestParam(name = "user_name") String name,
  //   @RequestParam(name = "email") String email,
  //   @RequestParam(name = "password") String password,
  //   Model model
  // ) {
  //   User user = new User();
  //   user.setEmail(email);
  //   user.setPassword(password);
  //   user.setUser_name(name);
  //   System.out.println(
  //     "name:" + name + "\nEmail:" + email + "\npassword" + password
  //   );
  //   // model.addAttribute("name", name);
  //   // model.addAttribute("email", email);
  //   // model.addAttribute("password", password);
  //   model.addAttribute("user", user);
  //   return "success";
  // }
  @RequestMapping(path = "/processForm", method = RequestMethod.POST)
  public String processForm(@ModelAttribute User user, Model model) {
    if (user.getUser_name().isBlank()) {
      return "redirect:/contact";
    }
    System.out.println("User: " + user);
    this.userService.createUser(user);
    model.addAttribute("msg", "user with id:" + user.getId() + " created");
    return "success";
  }

  @ModelAttribute
  public void commonData(Model model) {
    model.addAttribute("Header", "Model Attribute");
    model.addAttribute("desc", "Spring framework");
    System.out.println("Adding common data");
  }
}
