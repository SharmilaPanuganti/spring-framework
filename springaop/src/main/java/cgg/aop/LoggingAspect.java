package cgg.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

  @Before(value = "execution(public String getName())")
  public void loggingAdvice() {
    System.out.println("Logged in ..Get method called");
  }
}
