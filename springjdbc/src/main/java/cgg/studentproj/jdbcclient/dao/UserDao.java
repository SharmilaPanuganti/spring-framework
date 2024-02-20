package cgg.studentproj.jdbcclient.dao;

import cgg.studentproj.jdbcclient.entities.User;
import java.util.List;

public interface UserDao {
  int createUser(User user);
  int changeUser(User user);
  int deleteUser(int id);
  User getUserById(int id);
  List<User> getAllUsers();
  String getNameById();
}
