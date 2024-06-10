package com.example.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class LearningSpringBootApplication {

	public static Logger logger = LoggerFactory.getLogger(LearningSpringBootApplication.class);

	public void init() {
		logger.info("Starting LearningSpringBootApplication!");
	}
	public static void main(String[] args) {
		logger.info("Running LearningSpringBootApplication!");
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}

}
