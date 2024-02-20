package cgg.springorm.dao;

import cgg.springorm.entities.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

  private HibernateTemplate hibernateTemplate;

  public HibernateTemplate getHibernateTemplate() {
    return hibernateTemplate;
  }

  @Autowired
  public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
    this.hibernateTemplate = hibernateTemplate;
  }

  @Override
  @Transactional
  public int saveStudent(Student s) {
    Integer res = (Integer) hibernateTemplate.save(s);
    return res;
  }

  @Override
  @Transactional
  public void updateStudent(Student s) {
    hibernateTemplate.update(s);
  }

  @Override
  @Transactional
  public void deleteStudent(int id) {
    Student student = hibernateTemplate.get(Student.class, id);
    hibernateTemplate.delete(student);
  }

  @Override
  public Student getStudentById(int id) {
    Student student = hibernateTemplate.get(Student.class, id);
    return student;
  }

  @Override
  public List<Student> getAllStudents() {
    List<Student> all = hibernateTemplate.loadAll(Student.class);
    return all;
  }
}
