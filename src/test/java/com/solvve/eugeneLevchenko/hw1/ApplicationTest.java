package com.solvve.eugeneLevchenko.hw1;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest

public class ApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnStatusOK() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/health")).andExpect(status().isOk());
	}
}