package com.example.jenkinsdemo.demojenkinsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoJenkinsApiApplication {

	@GetMapping("/hello")
	public static String sayHello(){
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApiApplication.class, args);
		System.out.println("Hello world ");
	}

}
