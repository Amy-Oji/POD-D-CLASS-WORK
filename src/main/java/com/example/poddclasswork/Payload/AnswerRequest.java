package com.example.poddclasswork.Payload;

import com.example.poddclasswork.model.QuestionModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerRequest {
    private String text;
    private QuestionModel question;

}
