package com.example.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/")
	public String GetTestString(){
		return "Test ...";
	}
	
	@GetMapping("/hello-world")
	public String GetHelloWorld(){
		return "Hello World!";
	}

}
