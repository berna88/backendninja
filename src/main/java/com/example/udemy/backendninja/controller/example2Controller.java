package com.example.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class example2Controller {
	
	public static final String EXAMPLE_2 = "example2";
	// La Url quedaria asi: localhost:8080/example2/reques1?nm=jose
	// 
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm", required=false, defaultValue="NULL") String name){
		ModelAndView model = new ModelAndView(EXAMPLE_2);
		model.addObject("nm_model", name);
		return model;
	}
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String valor){
		ModelAndView model = new ModelAndView(EXAMPLE_2);
		model.addObject("nm_model", valor);
		return model;
	}
	

}
