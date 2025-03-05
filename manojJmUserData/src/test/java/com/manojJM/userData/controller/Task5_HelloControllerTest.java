package com.manojJM.userData.controller; // Task 5: Write a simple JUnit test

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
class Task5_HelloControllerTest {

    private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new Task2_HelloController()).build();

    // Task 5: Test the hello endpoint
    @Test
    void hello() throws Exception {
        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello, World!"));
    }
}
