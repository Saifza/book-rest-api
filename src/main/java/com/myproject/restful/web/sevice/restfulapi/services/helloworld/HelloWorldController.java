package com.myproject.restful.web.sevice.restfulapi.services.helloworld;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;

	public HelloWorldController(MessageSource messageSource) {
		super();
		this.messageSource=messageSource;
	}

	
	@GetMapping(path="/hello-world")
	public HelloWorld greetingMessege() {
		
		return new HelloWorld("Hi There");
		
		
	}
	
	@GetMapping(path="/hello-world/fromString")
	public String greetingStringMessege() {
		
		return "Hi There";
		
		
	}
	
	@GetMapping (path= "/hello-world/path-variable/{name}")
	public HelloWorld helloWorldPathVariable(@PathVariable String name) {
		return  new HelloWorld("Hi "+name+", how are you going?");
	}
	
	

}
