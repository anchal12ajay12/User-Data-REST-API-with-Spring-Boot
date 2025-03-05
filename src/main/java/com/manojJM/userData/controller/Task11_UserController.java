package com.manojJM.userData.controller; // Task 11: Add query parameters to filter users by name or age

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Task11_UserController {

    private static List<User> users = List.of(
            new User("John", 25),
            new User("Jane", 30),
            new User("Tom", 22)
    );

    // Task 11: Endpoint to filter users by name or age
    @GetMapping("/users/filter")
    public List<User> getUsersByFilter(@RequestParam(required = false) String name, 
                                        @RequestParam(required = false) Integer age) {
        return users.stream()
                .filter(user -> (name == null || user.getName().equalsIgnoreCase(name)) &&
                        (age == null || user.getAge() == age))
                .collect(Collectors.toList());
    }
}
