package com.manojJM.userData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync // Task 15: Enable Async processing
@EnableScheduling  // Task 16: Enable Scheduling
public class ManojJmUserDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManojJmUserDataApplication.class, args);
	}

}
