package com.example.udemy.backendninja.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("exampleComponent")
public class ExampleController {
	
	private static final Log LOG = LogFactory.getLog(ExampleController.class);

	public void sayHello(){
		LOG.info("Hi From Componente");
	}
}
