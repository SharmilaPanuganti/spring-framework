package cgg.studentproj.dao;

import cgg.studentproj.entities.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  //  private NamedParameterJdbcTemplate namedParameter;

  //   public NamedParameterJdbcTemplate getNamedParameter() {
  //     return namedParameter;
  // }

  // public void setNamedParameter(NamedParameterJdbcTemplate namedParameter) {
  //     this.namedParameter = namedParameter;
  // }

  public JdbcTemplate getJdbcTemplate() {
    return jdbcTemplate;
  }

  public void setJdbcTemplate(JdbcTemplate template) {
    this.jdbcTemplate = template;
  }

  @Override
  public int saveStudent(Student s) {
    String query = "insert into Student(id,name,city) values(?,?,?)";
    // String query = "insert into Student(id,name,city) values(:id,:name,:city)";
    // MapSqlParameterSource namedParameters = new MapSqlParameterSource("id",s.getId()).addValue("name", s.getName()).addValue("city", s.getCity());
    // int r =
    //   this.namedParameter.update(query, namedParameters);
    int r =
      this.jdbcTemplate.update(query, s.getId(), s.getName(), s.getCity());
    return r;
  }

  @Override
  public int deleteStudent(int id) {
    String query = "delete from student where id=?";
    int r = this.jdbcTemplate.update(query, id);
    return r;
  }

  @Override
  public Student getStudent(int id) {
    String query = "select * from student where id=?";
    RowMapper<Student> rowMapper = new RowMapperImpl();
    Student student = this.jdbcTemplate.queryForObject(query, rowMapper);
    return student;
  }

  @Override
  public List<Student> getAllStudents() {}
}
