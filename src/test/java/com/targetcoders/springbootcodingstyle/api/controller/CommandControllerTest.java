package com.targetcoders.springbootcodingstyle.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.net.URI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class CommandControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void echoTest() throws Exception {
    mockMvc.perform(post(URI.create("/api/v1/command/echo")).content("test"))
        .andExpect(content().string("test"));
  }

}