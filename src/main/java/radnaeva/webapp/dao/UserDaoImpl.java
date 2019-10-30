package radnaeva.webapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import radnaeva.webapp.entity.User;
import radnaeva.webapp.mapper.UserMapper;

import java.util.List;

public class UserDaoImpl implements UserDao {

   public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAll() {
        String postgres = "SELECT * FROM my_app.new_users_table";
        return jdbcTemplate.query(postgres, new UserMapper());
    }


    public void save(User user) {
        String postgres = "INSERT INTO my_app.new_users_table(name, email, age) VALUES (?, ?, ?)";
    jdbcTemplate.update(postgres, user.getName(), user.getEmail(), user.getAge());
    }


    public User getById(int id) {
        String postgres = "SELECT * FROM my_app.new_users_table WHERE id=?";
        return jdbcTemplate.queryForObject(postgres, new UserMapper(), id);
    }


    public void update(User user) {
        String postgres = "UPDATE my_app.new_users_table SET name=?, email=?, age=? WHERE id =?";
        jdbcTemplate.update(postgres, user.getName(), user.getEmail(), user.getAge(), user.getId());

    }


    public void delete(int id) {
        String postgres = "DELETE FROM my_app.new_users_table WHERE id=?";
        jdbcTemplate.update(postgres, id);
    }
}
