package com.example.lab07_1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab07_1 {

	public static void main(String[] args) {
		SpringApplication.run(Lab07_1.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Hello World");

			// Additional logic or messages can be added here

			// Print the Spring Boot logo
//			printSpringBootLogo();

			// Print other log information
			printLogInformation();
		};
	}

	private void printLogInformation() {
		System.out.println("Nguyen Thanh Qui");
		// Print other log messages or information here
	}
}
