package cgg.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor {

  @Override
  public void postProcessBeanFactory(
    ConfigurableListableBeanFactory beanFactory
  ) throws BeansException {
    System.out.println("Bean factory is created");
    // beanFactory.addBeanPostProcessor(cgg.springdemo.DisplayNameBeanPostProcessor);
  }
}
