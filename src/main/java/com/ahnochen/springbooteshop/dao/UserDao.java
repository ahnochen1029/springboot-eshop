package com.ahnochen.springbooteshop.dao;

import com.ahnochen.springbooteshop.dto.UserRegisterRequest;
import com.ahnochen.springbooteshop.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(UserRegisterRequest userRegisterRequest);
}
