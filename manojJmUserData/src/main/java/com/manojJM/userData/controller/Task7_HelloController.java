package com.manojJM.userData.controller; // Task 7: Implement basic validation

import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task7_HelloController {

    // Task 7: Validate the name and age parameters
    @PostMapping("/greet/validate")
    public String greetPerson(@Valid @RequestBody Person person) {
        return "Hello, " + person.getName() + ". You are " + person.getAge() + " years old!";
    }
}
