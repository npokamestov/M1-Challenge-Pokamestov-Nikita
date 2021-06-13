package com.randomFunService.randomFunService.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.randomFunService.randomFunService.model.Answer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RandomFunServiceController.class)
public class RandomFunServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private Answer answer = new Answer();

    @Test
    public void shouldReturnRandomQuoteObjectOnGetRequest() throws Exception {
        mockMvc.perform(
                get("/quote"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty());
    }

    @Test
    public void shouldReturnRandomDefinitionObjectOnGetRequest() throws Exception {
        mockMvc.perform(
                get("/word"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty());
    }

    @Test
    public void shouldReturnRandomAnswerObjectOnPostRequest() throws Exception {
        answer.setQuestion("Is this a good question?");

        String inputJson = mapper.writeValueAsString(answer);

        mockMvc.perform(
                post("/magic")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.question").value(answer.getQuestion()))
                .andExpect(jsonPath("$.id").isNotEmpty())
                .andExpect(jsonPath("$.answer").isNotEmpty());
    }
}