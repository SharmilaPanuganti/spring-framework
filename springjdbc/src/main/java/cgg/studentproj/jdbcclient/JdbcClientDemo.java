package cgg.studentproj.jdbcclient;

import cgg.studentproj.jdbcclient.config.JdbcClientConfig;
import cgg.studentproj.jdbcclient.dao.UserDao;
import cgg.studentproj.jdbcclient.entities.User;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcClientDemo {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
      JdbcClientConfig.class
    );
    UserDao userDao = context.getBean("userDao", UserDao.class);
    User user = new User();
    user.setId(4);
    user.setName("suv");
    user.setAbout("User no 4");
    // int res = userDao.createUser(user);
    // System.out.println(res + " added");
    // User getuser = userDao.getUserById(2);
    // System.out.println(getuser);
    // int res = userDao.changeUser(user);
    // System.out.println(res + " updated");
    // int res = userDao.deleteUser(2);
    // System.out.println(res + " deleted");
    // List<User> allUsers = userDao.getAllUsers();
    // allUsers.forEach(System.out::println);
    System.out.println(userDao.getNameById());
  }
}
