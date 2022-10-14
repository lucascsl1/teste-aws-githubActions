package com.hello.application.test.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.hello.application.controller.HelloController;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	void hello() {
		HelloController controller = new HelloController();
		assertEquals("Hello, World!", controller.hello());
	}

	@Test
	void helloRequest() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Hello, World!", result.getResponse().getContentAsString());
	}
}
