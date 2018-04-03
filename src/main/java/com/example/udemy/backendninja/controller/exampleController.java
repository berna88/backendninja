package com.example.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.udemy.backendninja.models.Persona;

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
		model.addAttribute("people", getPeople());
		model.addAttribute("apellidos", "Hernández Ramírez");
		return EXAMPLE_VIEW;
	}
	// segunda forma de obtener la vista
	@GetMapping("exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView model = new ModelAndView(EXAMPLE_VIEW);
		model.addObject("people", getPeople());
		model.addObject("apellidos", "Molina Soto");
		return model;
	}
	
	private List<Persona> getPeople(){
		List<Persona> people = new ArrayList<>();
		people.add(new Persona("Bernardo", 8));
		people.add(new Persona("Juan", 40));
		people.add(new Persona("Pilato", 25));
		people.add(new Persona("Fracisco", 19));
		return people;
	}

}
