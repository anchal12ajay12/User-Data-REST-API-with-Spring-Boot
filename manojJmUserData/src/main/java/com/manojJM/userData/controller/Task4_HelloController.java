package com.manojJM.userData.controller; // Task 4: Create a POST API

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task4_HelloController {

    // Task 4: Post API that accepts name and age and returns a greeting message
    @PostMapping("/greet")
    public String greetPerson(@RequestBody Person person) {
        return "Hello, " + person.getName() + ". You are " + person.getAge() + " years old!";
    }
}
