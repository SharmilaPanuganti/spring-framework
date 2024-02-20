package productcrudapp.config;

import jakarta.servlet.annotation.MultipartConfig;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import productcrudapp.model.Product;

@Configuration
@ComponentScan(basePackages = "productcrudapp")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@EnableWebMvc
@MultipartConfig
public class AppConfig implements WebMvcConfigurer {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
      .addResourceHandler("/resources/**")
      .addResourceLocations("/WEB-INF/resources/");
  }

  @Bean("viewResolver")
  InternalResourceViewResolver getViewResolver() {
    InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
    internalResourceViewResolver.setPrefix("/WEB-INF/views/");
    internalResourceViewResolver.setSuffix(".jsp");
    return internalResourceViewResolver;
  }

  @Bean("multipartResolver")
  StandardServletMultipartResolver getMultipartResolver() {
    StandardServletMultipartResolver resolver = new StandardServletMultipartResolver();
    return resolver;
  }

  @Value("${db.driverClassName}")
  private String driverClass;

  @Value("${db.username}")
  private String userName;

  @Value("${db.url}")
  private String url;

  @Value("${db.password}")
  private String password;

  @Bean("ds")
  DriverManagerDataSource getDataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setUrl(url);
    ds.setUsername(userName);
    ds.setDriverClassName(driverClass);
    ds.setPassword(password);
    return ds;
  }

  @Bean("factory")
  LocalSessionFactoryBean getFactory() {
    LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
    factory.setDataSource(getDataSource());
    Properties p = new Properties();
    p.put("hibernate.hbm2ddl.auto", "update");
    p.put("hibernate.show_sql", true);
    p.put("hibernate.format_sql", true);
    p.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
    factory.setHibernateProperties(p);
    factory.setAnnotatedClasses(Product.class);
    return factory;
  }

  @Bean("transactionManager")
  HibernateTransactionManager getTransactionManager() {
    HibernateTransactionManager tx = new HibernateTransactionManager();
    tx.setSessionFactory(getFactory().getObject());
    return tx;
  }
}
