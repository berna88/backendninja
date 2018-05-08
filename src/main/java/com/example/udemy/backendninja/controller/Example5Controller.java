package com.example.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class Example5Controller {
	
	public static final String EXAMPLE_VIEW = "example5";
	
	@GetMapping("/example5")
	public String viewExampleFive(){
		return EXAMPLE_VIEW;
	}
	
	@GetMapping("/example5-1")
	public ModelAndView exampleMAV(){
		ModelAndView view = new ModelAndView(EXAMPLE_VIEW);
		view.addObject("persona", "Bernardo");
		return view;
	}

}
