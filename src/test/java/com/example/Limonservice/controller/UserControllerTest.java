package com.example.Limonservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)

public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUserSignUpIsCreated() throws Exception {
        mockMvc.perform(post("/limon-servise/users/sign-up")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        " \"email\" : \"vasya@email.com\",\n" +
                        " \"name\" : \"VasyaVasiliy\",\n" +
                        " \"password\" :\"qwerty\",\n" +
                        " \"phone\" :\"+375291234567\"\n" +
                        "}\n"))
                .andExpect(status().isOk());
    }
}
