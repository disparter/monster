package com.github.disparter.ddnext.monster;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.github.disparter.ddnext.monster.controller.SpeedController;

@RunWith(SpringRunner.class)
@WebMvcTest(SpeedController.class)
public class SpeedConstrollerTest {

    private static final String VERSION = "/v1";
    private static final String SPEED = "/speeds";

    
    @Autowired
    private MockMvc mvc;

    @MockBean
    private SpeedController controller;
    
    @Test
    public void getTypes() throws Exception {

       mvc.perform(get(VERSION + SPEED + "/types")
           .contentType(APPLICATION_JSON))
           .andExpect(status().isOk());
       
   }

}
