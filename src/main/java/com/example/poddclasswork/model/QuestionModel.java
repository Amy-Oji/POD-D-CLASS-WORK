package com.example.poddclasswork.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionModel {

    private Long id;
    private String title;
    private String description;
    private String createdAt;
    private String updatedAt;
}
