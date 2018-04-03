package com.example.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HelloWorld {
	
	@GetMapping("/hello")
	public String helloWorld(){
		return "helloworld";
	}
	@GetMapping("/bernardo")
	public String show(){
		return "show";
	}
}
