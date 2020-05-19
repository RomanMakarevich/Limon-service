package com.example.Limonservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class AddMileageTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addMileage() throws Exception {
        mockMvc.perform(post("/limon-service/1/cars/1/mileage")
                .header("userId", 1)
                .param("carId", "1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        " \"mileage\" : 509500,\n" +
                        " \"date\" : \"2020-01-02\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }
}
