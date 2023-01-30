package com.ahnochen.springbooteshop.service;

import com.ahnochen.springbooteshop.dto.UserLoginRequest;
import com.ahnochen.springbooteshop.dto.UserRegisterRequest;
import com.ahnochen.springbooteshop.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
