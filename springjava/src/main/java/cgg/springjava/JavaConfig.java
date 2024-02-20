package cgg.springjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = "cgg.springjava")
public class JavaConfig {

  @Bean(name = { "p1", "p2", "p3" })
  public Person getPerson() {
    return new Person(getSamosa());
  }

  @Bean
  public Samosa getSamosa() {
    return new Samosa();
  }
}
