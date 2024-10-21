package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquibaseApplication {

	public static void main(String[] args) {
		System.out.println("Starting...");
		SpringApplication.run(LiquibaseApplication.class, args);
	}

}
