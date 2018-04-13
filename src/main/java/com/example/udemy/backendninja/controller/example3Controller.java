package com.example.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.udemy.backendninja.models.Persona;

@Controller
@RequestMapping("/example3")
public class example3Controller {
	public static final String FORM_VIEW = "form";
	public static final String ADD_PERSON = "addperson";
	
	@GetMapping("/showform")
	public String showForm(Model model){
		model.addAttribute("person", new Persona());
		return FORM_VIEW;
	}
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Persona persona){
		ModelAndView model = new ModelAndView(ADD_PERSON);
		model.addObject("person", persona);
		return model;
	}

}
