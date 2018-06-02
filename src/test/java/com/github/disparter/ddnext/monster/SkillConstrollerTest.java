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

import com.github.disparter.ddnext.monster.controller.SkillController;

@RunWith(SpringRunner.class)
@WebMvcTest(SkillController.class)
public class SkillConstrollerTest {

    private static final String VERSION = "/v1";
    private static final String SKILL = "/skills";

    
    @Autowired
    private MockMvc mvc;

    @MockBean
    private SkillController controller;
    
    @Test
    public void getTypes() throws Exception {

       mvc.perform(get(VERSION + SKILL + "/types")
           .contentType(APPLICATION_JSON))
           .andExpect(status().isOk());
       
   }

}
