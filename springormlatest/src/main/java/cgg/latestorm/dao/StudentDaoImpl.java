package cgg.latestorm.dao;

import cgg.latestorm.entities.Student;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

  private SessionFactory factory;

  public SessionFactory getFactory() {
    return factory;
  }

  @Autowired
  public void setFactory(SessionFactory factory) {
    this.factory = factory;
  }

  @Override
  @Transactional
  public Student saveStudent(Student s) {
    factory.getCurrentSession().persist(s);
    return s;
  }
}
