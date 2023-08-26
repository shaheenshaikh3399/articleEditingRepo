package com.example.versioncontrolservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private String userId;
    private String username;
    private String email;
    private String password;
    private String role ;
    private String permissions;
    private String profileInformation;
}
