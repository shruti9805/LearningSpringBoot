package com.example.learningspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearningSpringBootApplicationTests {

	Logger logger = LoggerFactory.getLogger(LearningSpringBootApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("In Test Class LearningSpringBootApplicationTests!");
		Assert.assertEquals(true, true);
	}

}
