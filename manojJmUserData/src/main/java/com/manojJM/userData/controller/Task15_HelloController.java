package com.manojJM.userData.controller; // Task 15: Create an endpoint that returns numbers asynchronously

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class Task15_HelloController {

    /* Task 15: Asynchronous endpoint to return numbers from 1 to 10
	 * changes in ManojJmUserDataApplication.java File
	 */
    @Async
    @GetMapping("/numbers")
    public List<Integer> getNumbers() {
        return IntStream.range(1, 11)
                .boxed()
                .collect(Collectors.toList());
    }
}
