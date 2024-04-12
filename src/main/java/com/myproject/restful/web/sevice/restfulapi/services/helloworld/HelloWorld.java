package com.myproject.restful.web.sevice.restfulapi.services.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class HelloWorld {
	
	private String messege;
	
     @Autowired
	public HelloWorld(String messege) {
		
		
		this.messege = messege;
	}

	public String getMessege() {
		return messege;
	}

	@Override
	public String toString() {
		return "HelloWorld [messege=" + messege + "]";
	}
	

}
