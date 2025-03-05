package com.manojJM.userData.controller; // Task 6: Add a new REST API endpoint

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task6_HelloController {

    // Task 6: Return the same JSON data received
    @PostMapping("/echo")
    public Person echo(@RequestBody Person person) {
        return person;
    }
}
