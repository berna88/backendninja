package com.example.udemy.backendninja.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
	
	public static final String E500_VIEW = "error/500";
	
	@ExceptionHandler(Exception.class)
	public String viewError(){
		return E500_VIEW;
	}

}
