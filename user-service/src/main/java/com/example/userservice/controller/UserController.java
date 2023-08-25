package com.example.userservice.controller;

import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<UserDto> registerUser(@RequestBody @Valid User user){
        return new ResponseEntity<>(userService.registerUser(user), HttpStatus.CREATED);

    }
    @GetMapping("/user/{userID/roles/{roles}}")
    public ResponseEntity<UserDto> getUserByRole(@PathVariable String userID, @PathVariable String role){
        return ResponseEntity.ok(userService.getUserById(userID, role));
    }

}
