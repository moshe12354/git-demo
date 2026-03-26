package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hello from branch2 considering branch1");
		System.out.println("bad commit");
		SpringApplication.run(DemoApplication.class, args);
	}

}
