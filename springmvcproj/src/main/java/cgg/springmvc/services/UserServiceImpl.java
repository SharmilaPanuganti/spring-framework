package cgg.springmvc.services;

import cgg.springmvc.dao.UserDao;
import cgg.springmvc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userdao;

  @Override
  public User createUser(User user) {
    userdao.saveUser(user);
    return user;
  }
}
