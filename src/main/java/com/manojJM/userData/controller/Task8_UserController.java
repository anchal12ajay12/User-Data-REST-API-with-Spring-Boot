package com.manojJM.userData.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class Task8_UserController {

    private static List<User> users = new ArrayList<>();
    private static Long idCounter = 1L; // To simulate ID auto-increment
    private static final Logger logger = LoggerFactory.getLogger(Task9_HelloController.class);

    // POST /users/add - Add a user
    @PostMapping("/users/add")
    public String addUser(@RequestBody User user) {
        // Setting the auto-incremented ID for the new user
        logger.info("Hello endpoint was called");

        user.setId(idCounter++);
        users.add(user);
        return "User added!";
    }

    // GET /users/{id} - Get a user by ID
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        Optional<User> user = users.stream()
                                    .filter(u -> u.getId().equals(id))
                                    .findFirst();
        return user.orElse(null); // Return the user if found, otherwise null
    }

    // GET /users - List all users
    @GetMapping("/users")
    public List<User> getUsers() {
        return users;
    }

    // DELETE /users/{id} - Delete a user by ID
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        users.removeIf(user -> user.getId().equals(id));
        return "User deleted!";
    }
}
