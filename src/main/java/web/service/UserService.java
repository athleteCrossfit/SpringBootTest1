package web.service;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    List<User> getAllUsers();
    User getByEmail(String email);
}
