package com.example.task_manager.dto;

import com.example.task_manager.enums.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)    //while i am adding tasks , if any unrecognizable field is added , it will be ignored
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private Category category;    
    private boolean isCompleted;
    private UserDTO user;                  //or this can simply be commented out in dto itself since we dont want stackoverflow
                                             //but if not commenting out, we have already provided JsonBackReference and JsonManagedReference
}
