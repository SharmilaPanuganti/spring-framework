package cgg.studentproj.jdbcclient.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@Configuration
@ComponentScan(basePackages = "cgg.studentproj,jdbcclient.dao")
@PropertySource("classpath:db.properties")
public class JdbcClientConfig {

  @Value("${db.driverClassName}")
  String driver;

  @Value("${db.url}")
  String url;

  @Value("${db.userName}")
  String userName;

  @Value("${db.password}")
  String password;

  @Bean("ds")
  BasicDataSource getDataSource() {
    BasicDataSource ds = new BasicDataSource();
    ds.setDriverClassName(driver);
    ds.setUrl(url);
    ds.setUsername(userName);
    ds.setPassword(password);
    return ds;
  }

  @Bean("jdbcClient")
  JdbcClient getJdbcClient() {
    JdbcClient jdbcClient = JdbcClient.create(getDataSource());
    return jdbcClient;
  }

  @Bean("simpleJdbcCall")
  SimpleJdbcCall getSimpleJdbcCall() {
    SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(getDataSource());
    return simpleJdbcCall;
  }
}
