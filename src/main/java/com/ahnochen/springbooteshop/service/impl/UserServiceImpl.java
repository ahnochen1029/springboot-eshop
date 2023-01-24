package com.ahnochen.springbooteshop.service.impl;

import com.ahnochen.springbooteshop.dao.UserDao;
import com.ahnochen.springbooteshop.dto.UserRegisterRequest;
import com.ahnochen.springbooteshop.model.User;
import com.ahnochen.springbooteshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
