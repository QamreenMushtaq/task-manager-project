package com.example.task_manager.dto;

import java.util.List;

import com.example.task_manager.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private Role role;
    private List<TaskDTO> tasks;
}
