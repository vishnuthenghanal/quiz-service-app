package com.codan.quizserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizServiceAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuizServiceAppApplication.class, args);
	}

}
