package cgg.springorm.config;

import cgg.springorm.entities.Student;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "cgg.springorm.dao")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class AppConfig {

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
    factory.setHibernateProperties(p);
    factory.setAnnotatedClasses(Student.class);
    return factory;
  }

  @Bean("hibernateTemplate")
  HibernateTemplate getTemplate() {
    HibernateTemplate hibernateTemplate = new HibernateTemplate();
    hibernateTemplate.setSessionFactory(getFactory().getObject());
    return hibernateTemplate;
  }

  @Bean("transactionManager")
  HibernateTransactionManager getTransactionManager() {
    HibernateTransactionManager tx = new HibernateTransactionManager();
    tx.setSessionFactory(getFactory().getObject());
    return tx;
  }
}
