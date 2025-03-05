package com.manojJM.userData.controller; // Task 14: Handle exceptions globally using @ControllerAdvice

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Task14_HelloController {

    // Task 14: Simulate an exception
    @GetMapping("/error")
    public String triggerError(@RequestParam String name) {
        if (name.equals("error")) {
            throw new RuntimeException("Something went wrong!");
        }
        return "Hello, " + name;
    }
}
