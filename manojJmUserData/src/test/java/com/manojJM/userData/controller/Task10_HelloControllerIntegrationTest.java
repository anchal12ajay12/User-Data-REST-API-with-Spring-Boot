package com.manojJM.userData.controller; // Task 10: Write a simple integration test

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class Task10_HelloControllerIntegrationTest {

    private MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new Task6_HelloController()).build();

    // Task 10: Test the echo endpoint
    @Test
    void echo() throws Exception {
        mockMvc.perform(post("/echo")
                .contentType("application/json")
                .content("{\"name\":\"John\",\"age\":25}"))
            .andExpect(status().isOk());
    }
}
