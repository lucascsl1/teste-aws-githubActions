package com.hello.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@ResponseBody
	@GetMapping("/")
	public String hello() {
		return "Hello, World!";
	}

}
