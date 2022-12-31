package com.javacampus.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloworldApplication {

	@GetMapping(value="/")
	public String index(){
		return "Hello World with Spring Boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
