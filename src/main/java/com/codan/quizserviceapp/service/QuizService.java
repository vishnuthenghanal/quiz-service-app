package com.codan.quizserviceapp.service;

import com.codan.quizserviceapp.feign.QuizInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    private QuizInterface quizInterface;

    public ResponseEntity<String> getQuestions() {
        return quizInterface.getQuestion();
    }
}
