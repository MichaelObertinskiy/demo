package com.antares.demo.model.dto.role;

import com.antares.demo.model.Role;

import java.util.List;

public interface RoleDAO {

    public void addRole (Role role);

    public List<Role> listRole();

    public void removeRole(Integer id);

}
