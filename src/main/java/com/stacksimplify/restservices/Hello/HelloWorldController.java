package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.Model.User;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/hellobean")
	public User hellowroldBean() {
		
		return new User("Pavan","Kumar","Chirala");
		
	}

}
