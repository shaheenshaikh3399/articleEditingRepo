package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;

public interface UserService {
    UserDto registerUser(User user);

    UserDto getUserById(String userID, String role);
}
