package cgg.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName)
    throws BeansException {
    System.out.println("After initialization method" + beanName);
    return bean;
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
    throws BeansException {
    System.out.println("Before initialization " + beanName);
    return bean;
  }
}
