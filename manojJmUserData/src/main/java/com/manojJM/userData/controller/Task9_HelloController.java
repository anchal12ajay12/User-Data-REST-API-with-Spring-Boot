package com.manojJM.userData.controller; // Task 9: Learn and configure basic logging

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task9_HelloController {

    private static final Logger logger = LoggerFactory.getLogger(Task9_HelloController.class);

    // Task 9: Log the API request and response
    @GetMapping("/helloLogger")
    public String hello() {
        logger.info("Hello endpoint was called");
        return "Hello, World Logger!";
    }
}
