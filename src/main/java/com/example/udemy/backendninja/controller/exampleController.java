package com.example.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class exampleController {
	// nombre de la vista
	public static final String EXAMPLE_VIEW = "example";
	//Primera forma es la vista a retornar si la vista de la carpeta template es example por ejemplo no es necesario el .html
	// value: recoge el metodo por ejemplo exampleString y el tipo de metodo
	//@RequestMapping(value="exampleString", method=RequestMethod.GET)
	@GetMapping("exampleString")
	public String exampleString(Model model){
		model.addAttribute("name", "Bernardo");
		return EXAMPLE_VIEW;
	}
	// segunda forma de obtener la vista
	@GetMapping("exampleMAV")
	public ModelAndView exampleMAV(){
		return new ModelAndView(EXAMPLE_VIEW);
	}

}
