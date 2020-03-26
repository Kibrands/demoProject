package com.kibrands.demo.service;

import com.kibrands.demo.model.User;

import java.util.List;

public interface UserService {

    User getUser(Integer userId);

    List<User> getAllUsers();

    void insertUser(User user);

    boolean updateUser(User user);

    boolean deleteUser(Integer id);
}
