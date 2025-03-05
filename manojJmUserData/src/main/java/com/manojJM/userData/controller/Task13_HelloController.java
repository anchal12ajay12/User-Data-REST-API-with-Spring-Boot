package com.manojJM.userData.controller; // Task 13: Add a feature to count the number of times each endpoint has been called

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task13_HelloController {

    private static int helloCount = 0;

    // Task 13: Endpoint with call count feature
    @GetMapping("/helloCount")
    public String hello() {
        helloCount++;
        return "Hello, World Count! This endpoint has been called " + helloCount + " times.";
    }
}
