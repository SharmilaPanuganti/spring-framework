package cgg.springmvc.controller;

import cgg.springmvc.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

  @GetMapping("/complexform")
  public String showForm() {
    return "complex_form";
  }

  @PostMapping("/handleForm")
  public String formHandler(
    @ModelAttribute Student student,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "complex_form";
    }
    return "success_complex";
  }

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    // binder.setDisallowedFields(new String[] {"mobile"});  //field to be not included
    // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    // SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    // binder.registerCustomEditor(
    //   Date.class,
    //   "dob",
    //   new CustomDateEditor(dateFormat, false)
    // );
    binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
  }
}
