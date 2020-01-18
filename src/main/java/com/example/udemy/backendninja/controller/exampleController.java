package com.example.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.udemy.backendninja.component.ExampleComponent;
import com.example.udemy.backendninja.models.Persona;
import com.example.udemy.backendninja.service.ExampleService;

@Controller
@RequestMapping("/example")
public class exampleController {
	
	//Nombre del servicio
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	// vamos a inyectar un componente con el nombre de bean
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent component;
	
	
	// nombre de la vista
	public static final String EXAMPLE_VIEW = "example";
	//Primera forma es la vista a retornar si la vista de la carpeta template es example por ejemplo no es necesario el .html
	// value: recoge el metodo por ejemplo exampleString y el tipo de metodo
	//@RequestMapping(value="exampleString", method=RequestMethod.GET)
	@GetMapping("exampleString")
	public String exampleString(Model model){
		component.sayHello();
		model.addAttribute("people", exampleService.getListPeople());
		model.addAttribute("apellidos", "Hernández Ramírez");
		return EXAMPLE_VIEW;
	}
	// segunda forma de obtener la vista
	@GetMapping("exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView model = new ModelAndView(EXAMPLE_VIEW);
		model.addObject("people", exampleService.getListPeople());
		model.addObject("apellidos", "Molina Soto");
		return model;
	}
	
}
