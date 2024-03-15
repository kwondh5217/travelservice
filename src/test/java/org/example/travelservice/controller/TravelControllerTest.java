package org.example.travelservice.controller;

import org.example.travelservice.domain.Travel;
import org.example.travelservice.repository.TravelRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
class TravelControllerTest {

    @Autowired
    TravelRepository travelRepository;

    @Autowired
    MockMvc mockMvc;

    @Test
    void findSido() throws Exception{
        mockMvc.perform(get("/travels/sido")
                        .param("sidoCode", "32")
                        .param("page", "0"))
                .andExpect(status().isOk());
    }

    @Test
    void findGugun() throws Exception{
        mockMvc.perform(get("/travels/gugun")
                        .param("gugunCode", "18")
                        .param("page", "0"))
                .andExpect(status().isOk());
    }

}