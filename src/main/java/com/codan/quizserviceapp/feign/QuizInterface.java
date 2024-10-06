package com.codan.quizserviceapp.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("QUESTION-SERVICE-APP")
public interface QuizInterface {

    @GetMapping("question/getQuestion")
    ResponseEntity<String> getQuestion();

}
