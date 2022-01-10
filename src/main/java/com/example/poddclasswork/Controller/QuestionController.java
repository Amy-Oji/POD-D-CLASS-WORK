package com.example.poddclasswork.Controller;

import com.example.poddclasswork.Payload.QuestionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private RestTemplate restTemplate;

    @Autowired
    public QuestionController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public void postAQuestion(@RequestBody QuestionRequest questionRequest){
        // call daro api
    }
}
