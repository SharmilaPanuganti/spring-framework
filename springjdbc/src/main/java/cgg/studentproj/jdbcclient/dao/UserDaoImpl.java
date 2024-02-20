package cgg.studentproj.jdbcclient.dao;

import cgg.studentproj.jdbcclient.entities.User;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {

  @Autowired
  private SimpleJdbcCall simpleJdbcCall;

  public SimpleJdbcCall getSimpleJdbcCall() {
    return simpleJdbcCall;
  }

  public void setSimpleJdbcCall(SimpleJdbcCall simpleJdbcCall) {
    this.simpleJdbcCall = simpleJdbcCall;
  }

  @Autowired
  private JdbcClient jdbcClient;

  public UserDaoImpl() {}

  public UserDaoImpl(JdbcClient jdbcClient) {
    this.jdbcClient = jdbcClient;
  }

  @Override
  public int createUser(User user) {
    int update =
      this.jdbcClient.sql("insert into user1 values(?,?,?)")
        .param(1, user.getId())
        .param(2, user.getName())
        .param(3, user.getAbout())
        .update();
    return update;
  }

  @Override
  public int changeUser(User user) {
    int update = jdbcClient
      .sql("update user1 set name=:name,about=:about where id=:id")
      .param("name", user.getName())
      .param("about", user.getAbout())
      .param("id", user.getId())
      .update();
    return update;
  }

  @Override
  public int deleteUser(int id) {
    return jdbcClient.sql("delete from user1 where id=?").param(1, id).update();
  }

  @Override
  public User getUserById(int id) {
    User user = jdbcClient
      .sql("select * from user1 where id=:id")
      .param("id", id)
      .query(User.class)
      .single();
    return user;
  }

  @Override
  public List<User> getAllUsers() {
    return jdbcClient.sql("select * from user1").query(User.class).list();
  }

  @Override
  public String getNameById() {
    simpleJdbcCall
      .withoutProcedureColumnMetaDataAccess()
      .withProcedureName("student_proc");
    MapSqlParameterSource input = new MapSqlParameterSource();
    input.addValue("st_id", 2);
    Map<String, Object> out = simpleJdbcCall.execute(input);
    String name = (String) out.get("student_name");
    return name;
  }
}
