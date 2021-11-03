package web.service;

import web.model.Role;

import java.util.List;

public interface RoleService {
    Role save(Role role);
    List<Role> getAllRoles();
    Role getRoleByName(String name);
}
