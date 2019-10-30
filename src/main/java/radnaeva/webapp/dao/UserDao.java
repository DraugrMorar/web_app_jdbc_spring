package radnaeva.webapp.dao;
import java.util.*;
import radnaeva.webapp.entity.User;

public interface UserDao {
    List<User> findAll();
    void update(User user);
    void delete(int id);
    void save(User user);
    User getById(int id);
}
