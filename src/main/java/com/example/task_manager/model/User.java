package com.example.task_manager.model;

import java.util.ArrayList;
import java.util.List;

import com.example.task_manager.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique=true, nullable=false)
    private String email;


    @Column(nullable=false)
    @JsonIgnore
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private Role role;                           //enum
    
    @JsonManagedReference(value ="users-tasks")   
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL)    
    private List<Task> tasks = new ArrayList<>();

}
