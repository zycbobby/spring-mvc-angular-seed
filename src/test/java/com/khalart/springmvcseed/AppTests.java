package com.khalart.springmvcseed;

import com.khalart.springmvcapp.config.AppConfig;
import com.khalart.springmvcapp.config.WebConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {
        AppConfig.class
})
public class AppTests {
    private MockMvc mockMvc;

    @Inject
    protected WebApplicationContext wac;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void simple() throws Exception {
        //mockMvc.perform(get("/"))
        //        .andExpect(status().isOk())
        //        .andExpect(view().name("hello"));
    }
}
