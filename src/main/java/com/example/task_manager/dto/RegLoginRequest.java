package com.example.task_manager.dto;

import com.example.task_manager.enums.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegLoginRequest {

    @Email(message="Invalid email address")
    @NotBlank(message="Email is required")
    private String email;

    @NotBlank(message="Password is required")
    private String password;
    
    private Role role;
}
