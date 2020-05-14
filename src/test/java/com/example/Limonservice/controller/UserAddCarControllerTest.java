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

public class UserAddCarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addCarTest() throws Exception {
        mockMvc.perform(post("/limon-service/cars")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        " \"make\" : \"Mercedes-benz\",\n" +
                        " \"model\" : \"W123\",\n" +
                        " \"vin\" : \"wdb12312312312312\",\n" +
                        " \"releaseYear\" : \"1983\",\n" +
                        " \"engineType\" : \"240D\",\n" +
                        " \"typeOfTransmission\" : \"mechanical\",\n" +
                        " \"mileage\" : \"500000\",\n" +
                        " \"date\" : \"2020-01-01\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }
}