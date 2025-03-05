package com.manojJM.userData.controller; // Task 3: Add a second REST API endpoint

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task3_HelloController {

	// Task 3: Greet a person dynamically
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable("name") String name) {
        return "Hello, " + name + "!";
    }
}
