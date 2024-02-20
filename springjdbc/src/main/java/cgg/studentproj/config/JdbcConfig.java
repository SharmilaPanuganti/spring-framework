package cgg.studentproj.config;

import cgg.studentproj.dao.StudentDao;
import cgg.studentproj.dao.StudentDaoImpl;
import java.sql.DriverManager;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = "cgg.studentproj.dao")
public class JdbcConfig {

  @Value("${db.driverClassName}")
  String driver;

  @Value("${db.url}")
  String url;

  @Value("${db.userName}")
  String userName;

  @Value("${db.password}")
  String password;

  //BasicDataSource
  DriverManagerDataSource getDataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    // BasicDataSource ds=new BasicDataSource();
    ds.setDriverClassName(driver);
    ds.setUrl(url);
    ds.setUsername(userName);
    ds.setPassword(password);
    return ds;
  }

  @Bean("jdbcTemplate")
  JdbcTemplate getJdbcTemplate() {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
    return jdbcTemplate;
  }

  @Bean("namedJdbcTemplate")
  NamedParameterJdbcTemplate getNamedJdbcTemplate() {
    NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(
      getDataSource()
    );
    return namedParameterJdbcTemplate;
  }

  @Bean("studentDao")
  StudentDao getStudentDao() {
    StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
    studentDaoImpl.setJdbcTemplate(getJdbcTemplate());
    return studentDaoImpl;
  }
}
