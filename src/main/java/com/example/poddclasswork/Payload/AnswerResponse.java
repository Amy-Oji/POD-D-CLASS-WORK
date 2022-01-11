package com.example.poddclasswork.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerResponse {
    private String createdAt;
    private String updatedAt;
    private Long id;
    private String text;

}
