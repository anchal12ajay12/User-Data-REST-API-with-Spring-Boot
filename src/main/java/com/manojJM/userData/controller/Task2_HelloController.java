package com.manojJM.userData.controller; // Task 2: Create a simple REST API endpoint

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task2_HelloController {

	// Task 2: Simple Hello World Endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
