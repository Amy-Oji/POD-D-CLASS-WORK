package com.example.poddclasswork.ServiceImpl;

import com.example.poddclasswork.Payload.QuestionRequest;
import com.example.poddclasswork.Repository.QuestionRepo;
import com.example.poddclasswork.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionServImpl implements QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    @Override
    public ResponseEntity saveQuestion(QuestionRequest questionRequest) {
        int result = questionRepo.save(questionRequest);
        if (result == 1) return new ResponseEntity("Question Saved", HttpStatus.OK);
        return new ResponseEntity("Error Occurred", HttpStatus.BAD_REQUEST);
    }
}
