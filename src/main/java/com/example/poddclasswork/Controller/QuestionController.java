package com.example.poddclasswork.Controller;

import com.example.poddclasswork.Payload.QuestionRequest;
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
        // call daro api
        System.out.println("local proj 1");
        QuestionModel questionModel =
                restTemplate.postForObject("http://localhost:8000/questions", questionRequest, QuestionModel.class);

        System.out.println("local proj 2");
        System.out.println(questionModel.getId());
        System.out.println(questionModel.getDescription());
    }
}
