package com.wheezy.blogmvc.repository;

import java.util.List;

public interface UserDao {

    public void addUser(User user);
    public List<User> listUser();
    public void removeUser(Integer id);
}
