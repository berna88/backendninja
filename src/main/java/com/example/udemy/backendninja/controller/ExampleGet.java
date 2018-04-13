package com.example.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exampleget")
public class ExampleGet {
	
	public static final String TEMPLATE_GET = "templateGet";
	
	@GetMapping("/view")
	public ModelAndView request1(@RequestParam(name="value") String val){
		ModelAndView model = new ModelAndView(TEMPLATE_GET);
		model.addObject("valor", val);
		return model;
	}
	@GetMapping("/view/{mr}")
	public ModelAndView solicitud2(@PathVariable(name="mr") String variable){
		ModelAndView model = new ModelAndView(TEMPLATE_GET);
		model.addObject("valor", variable);
		return model;
	}

}
