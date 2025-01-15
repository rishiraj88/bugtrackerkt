package rr.buggie.tracker

import org.hamcrest.Matchers
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import rr.buggie.tracker.controller.BugController

@AutoConfigureMockMvc
class BugControllerTests {

    @Autowired lateinit var mockMvc: MockMvc;

    @Test
    fun getAllBugs(){
        mockMvc.perform(MockMvcRequestBuilders.get("/bugs/api/v3"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize<Object>(3)))


    }

}

