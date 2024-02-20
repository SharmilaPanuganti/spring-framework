package cgg.springmvc.dao;

import cgg.springmvc.models.User;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public class UserDaoImpl implements UserDao {

  @Autowired
  private SessionFactory factory;

  public UserDaoImpl(SessionFactory factory) {
    this.factory = factory;
  }

  @Override
  @Transactional
  public User saveUser(User user) {
    this.factory.getCurrentSession().persist(user);

    return user;
  }
}
