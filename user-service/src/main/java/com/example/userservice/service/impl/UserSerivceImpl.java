package com.example.userservice.service.impl;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;
import com.example.userservice.exception.GlobalExceptionHandler;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserSerivceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public UserDto registerUser(User user) {
        User users = userRepository.save(user);
        return mapToDto(users);
    }

    @Override
    public UserDto getUserById(String userId, String role) {
        if(role.equals("Author") || role.equals("Editor")){
            User result = userRepository.findById(userId).orElseThrow(() ->
                    new GlobalExceptionHandler(String.format("User Not found with the Id %s: ", userId)));
            return mapToDto(result);
        } else
        {
            throw new GlobalExceptionHandler(String.format(" Your Role doesnt have an authority!"));
        }


    }

    private UserDto mapToDto(User user){
        return UserDto.builder()
                .userId(user.getUserId())
                .email(user.getEmail())
                .password(user.getPassword())
                .permissions(user.getPermissions())
                .profileInformation(user.getProfileInformation())
                .role(user.getRole())
                .username(user.getUsername())
                .build();
    }
}
