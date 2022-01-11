package com.example.poddclasswork.Service;

import com.example.poddclasswork.Payload.QuestionRequest;
import org.springframework.http.ResponseEntity;

public interface QuestionService {
    ResponseEntity saveQuestion(QuestionRequest questionRequest);
}
