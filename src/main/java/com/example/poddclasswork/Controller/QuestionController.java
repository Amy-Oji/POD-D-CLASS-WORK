package com.example.poddclasswork.Controller;

import com.example.poddclasswork.Payload.QuestionRequest;
import com.example.poddclasswork.Payload.QuestionResponse;
import com.example.poddclasswork.model.QuestionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuestionController {

    private RestTemplate restTemplate;

    @Autowired
    public QuestionController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/question")
    public void postAQuestion(@RequestBody QuestionRequest questionRequest){
        // calling daro api
        QuestionResponse questionResponse =
                restTemplate.postForObject("http://localhost:8000/questions", questionRequest, QuestionResponse.class);


        System.out.println(questionResponse.getId());
        System.out.println(questionResponse.getDescription());
    }
}
