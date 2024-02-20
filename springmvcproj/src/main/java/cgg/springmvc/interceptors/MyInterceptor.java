package cgg.springmvc.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(
    HttpServletRequest request,
    HttpServletResponse response,
    Object handler
  ) throws Exception {
    System.out.println("Pre handler");
    if (request.getParameter("name").startsWith("d")) {
      response.setContentType("text/html");
      PrintWriter writer = response.getWriter();
      writer.println("<h2>Invalid user name!User name starting with d</h2>");
      return false;
    }
    return true;
  }

  @Override
  public void afterCompletion(
    HttpServletRequest request,
    HttpServletResponse response,
    Object handler,
    Exception ex
  ) throws Exception {
    // TODO Auto-generated method stub
    System.out.println("After completion");
    // HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
  }

  @Override
  public void postHandle(
    HttpServletRequest request,
    HttpServletResponse response,
    Object handler,
    ModelAndView modelAndView
  ) throws Exception {
    // TODO Auto-generated method stub
    System.out.println("Post handler");
    //  HandlerInterceptor.super.postHandle(
    //   request,
    //   response,
    //   handler,
    //   modelAndView
    // );
  }
}
