package com.kibrands.demo.service.impl;

import com.kibrands.demo.mapper.UserMapper;
import com.kibrands.demo.model.User;
import com.kibrands.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUser(Integer userId) {
        return userMapper.getUser(userId);
    }

    public List<User> getAllUsers() {
        return new ArrayList<User>(userMapper.getAllUsers());
    }

    public void insertUser(User user) {
        this.userMapper.insertUser(user);
    }

    public boolean updateUser(User user) {
        return this.userMapper.updateUser(user);
    }

    public boolean deleteUser(Integer userId) {
        return this.userMapper.deleteUser(userId);
    }
}
