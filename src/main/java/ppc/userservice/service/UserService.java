package ppc.userservice.service;

import org.springframework.stereotype.Service;
import ppc.userservice.domain.Role;
import ppc.userservice.domain.User;

import java.util.List;


public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
