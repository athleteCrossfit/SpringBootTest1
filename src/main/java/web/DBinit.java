package web;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.User;
import web.service.RoleService;
import web.service.UserService;
import org.springframework.stereotype.Component;
import web.model.Role;


import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
class DbInit {

    @Autowired
    private  UserService userService;
    @Autowired
    private RoleService roleService;

    @PostConstruct
    private void postConstruct() {
        User user1 = new User();
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(roleService.save(new Role("ADMIN")));
        user1.setRoles(roleSet);
        user1.setEmail("admin@mail.ru");
        user1.setPassword("111");
        user1.setUsername("admin");
        userService.addUser(user1);

        User user2 = new User();
        Set<Role> roleSet2 = new HashSet<>();
        roleSet2.add(roleService.save(new Role("USER")));
        user2.setRoles(roleSet2);
        user2.setEmail("user@mail.ru");
        user2.setPassword("222");
        user2.setUsername("user");
        userService.addUser(user2);
    }
}