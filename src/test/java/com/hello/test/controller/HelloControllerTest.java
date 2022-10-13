package com.hello.test.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.hello.application.controller.HelloController;

public class HelloControllerTest {

	@Test
	void hello() {
		HelloController controller = new HelloController();
		assertEquals("Hello, World!", controller.hello());
	}
}
