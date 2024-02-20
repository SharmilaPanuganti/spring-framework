package cgg.springmvc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler({ NullPointerException.class })
  public String exeptionHandlerNull(Model m) {
    m.addAttribute("msg", "Error occured Null pointer");
    return "error_page";
  }

  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(NumberFormatException.class)
  public String exeptionHandlerNumberFormat(Model m) {
    m.addAttribute("msg", "Error occured number format exception");
    return "error_page";
  }

  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(Exception.class)
  public String exceptionHanlder(Model m) {
    m.addAttribute("msg", "Error Occurred");
    return "error_page";
  }
}
