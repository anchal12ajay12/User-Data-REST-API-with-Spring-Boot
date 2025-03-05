package com.manojJM.userData.controller; // Task 12: Use @RequestParam and @PathVariable in the same endpoint

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task12_HelloController {

    // Task 12: Use both PathVariable and RequestParam in the same endpoint
    @GetMapping("/greet/task12/{name}")
    public String greet(@PathVariable String name, @RequestParam(required = false) String message) {
        if (message != null) {
            return "Hello, " + name + "! " + message;
        } else {
            return "Hello, " + name + "!";
        }
    }
}
