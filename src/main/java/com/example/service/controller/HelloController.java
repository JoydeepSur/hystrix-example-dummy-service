package com.example.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class HelloController {
	
	
	@GetMapping
	public String hello() {
		return "Hello Hystrix!!";
	}
}
