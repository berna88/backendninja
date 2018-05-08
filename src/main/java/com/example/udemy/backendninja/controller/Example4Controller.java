package com.example.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.udemy.backendninja.models.Alumno;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	
	public static final String FORM = "formulario";
	public static final String ADD_AlUMNO = "addalumno";
	public static final String ERROR = "404";
	public static final String ERROR2 = "500";
	@GetMapping("/mostrarformulario")
	public String mostrarFormulario(Model model){
		model.addAttribute("alumno", new Alumno());
		return FORM;
	}
	
	@PostMapping("/addalumno")
	public ModelAndView addAlumno(@ModelAttribute("alumno") Alumno alumno){
		ModelAndView model = new ModelAndView(ADD_AlUMNO);
		model.addObject("alumno", alumno);
		return model;	
	}
	
	@GetMapping("/error")
	public String showError(){
		return ERROR;
	}
	@GetMapping("/error2")
	public String showError2(){
		return ERROR2;
	}
}
