package com.example.udemy.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.udemy.backendninja.models.Persona;
import com.example.udemy.backendninja.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{

	@Override
	public List<Persona> getListPeople() {
		List<Persona> people = new ArrayList<>();
		people.add(new Persona("Bernardo", 8));
		people.add(new Persona("Juan", 40));
		people.add(new Persona("Pilato", 25));
		people.add(new Persona("Fracisco", 19));
		return people;
	}

}
