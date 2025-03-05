package com.manojJM.userData.controller; // Task 18: Demonstrate the use of Actuator

import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task18_ActuatorController {

    // Task 18: Expose health check endpoint
    @GetMapping("/health")
    public Health healthCheck() {
        return Health.up().build();
    }
}
