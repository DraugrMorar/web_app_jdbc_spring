package radnaeva.webapp.service;
import java.util.*;
import radnaeva.webapp.entity.User;
public interface UserService {
    List<User> findAll();
    void save(User user);
    User getById(int id);
    void update(User user);
    void delete(int id);

}
