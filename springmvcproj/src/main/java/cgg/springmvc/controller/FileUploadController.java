package cgg.springmvc.controller;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@MultipartConfig
public class FileUploadController {

  @GetMapping("/fileform")
  public String showUploadForm() {
    System.out.println("File upload method");
    return "fileUpload";
  }

  @PostMapping("/uploadImage")
  public String fileUpload(
    @RequestParam("profile") MultipartFile file,
    HttpSession session,
    Model m
  ) throws IOException {
    System.out.println("file uploading");
    System.out.println(file.getSize());
    System.out.println(file.getContentType());
    System.out.println(file.getName());
    System.out.println(file.getOriginalFilename());
    byte data[] = null;
    try {
      data = file.getBytes();
    } catch (IOException e) {
      e.printStackTrace();
    }
    String path =
      session.getServletContext().getRealPath("/") +
      "WEB-INF" +
      File.separator +
      "resources" +
      File.separator +
      "images" +
      File.separator +
      file.getOriginalFilename();
    System.out.println(path);
    FileOutputStream fos = new FileOutputStream(path);
    fos.write(data);
    fos.close();
    System.out.println("file upload successful");
    m.addAttribute("msg", "file upload succesful");
    m.addAttribute("fileName", file.getOriginalFilename());
    return "file_success";
  }

  @RequestMapping("/user/{userId}/{userName}")
  public String getUserDetails(
    @PathVariable("userId") String id,
    @PathVariable("userName") String name
  ) {
    System.out.println(name);
    System.out.println(id);
    // Exception raising
    String str = null;
    // System.out.println(str.length());
    int i = Integer.parseInt("uuoiu");
    // int a[] = { 4 };
    // System.out.println(a[2]);
    return "home1";
  }
  // Handling exceptions
  // @ExceptionHandler({ NullPointerException.class })
  // public String exeptionHandlerNull(Model m) {
  //   m.addAttribute("msg", "Error occured Null pointer");
  //   return "error_page";
  // }

  // @ExceptionHandler(NumberFormatException.class)
  // public String exeptionHandlerNumberFormat(Model m) {
  //   m.addAttribute("msg", "Error occured number format exception");
  //   return "error_page";
  // }

  // @ExceptionHandler(Exception.class)
  // public String exceptionHanlder(Model m) {
  //   m.addAttribute("msg", "Error Occurred");
  //   return "error_page";
  // }
}
