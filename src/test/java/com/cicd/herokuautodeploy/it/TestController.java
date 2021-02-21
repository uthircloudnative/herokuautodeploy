package com.cicd.herokuautodeploy.it;

import com.cicd.herokuautodeploy.model.TestDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TestController {

   @Autowired
    private MockMvc mockMvc;

   @Autowired
   private ObjectMapper objectMapper;

   @Test
    void syaHello() throws Exception {
       mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
               .andExpect(status().isOk());
   }

   @Test
    void postHello_test()throws Exception {

       TestDto testData = new TestDto("test","success");

       mockMvc.perform(MockMvcRequestBuilders.post("/hello")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content(objectMapper.writeValueAsString(testData)))
               .andExpect(status().isOk());
   }
}
