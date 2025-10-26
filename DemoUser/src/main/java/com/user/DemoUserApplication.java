package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoUserApplication.class, args);
	    System.out.println("Hi");
	    System.out.println("Hello");
	}

}
