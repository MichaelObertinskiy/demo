package com.antares.demo.model.dto.user;


import com.antares.demo.model.User;

import java.util.List;

public interface UserDAO {

    public  void addUser(User user);

    public List<User> listUser();

    public void removeUser(Integer id);
}
