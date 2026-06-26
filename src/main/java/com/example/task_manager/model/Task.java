package com.example.task_manager.model;

import com.example.task_manager.enums.Category;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;          //enum

    private boolean isCompleted;

    @ManyToOne
    @JsonBackReference(value = "users-tasks")
    @JoinColumn(name = "user_id")        //FOREIGN KEY
    private User user;
}
