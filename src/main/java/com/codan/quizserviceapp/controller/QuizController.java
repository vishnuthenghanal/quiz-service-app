package com.codan.quizserviceapp.controller;

import com.codan.quizserviceapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("getQuestions")
    public ResponseEntity<String> getQuestions(){
        return quizService.getQuestions();
    }
}
