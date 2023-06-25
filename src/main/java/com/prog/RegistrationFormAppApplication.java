package com.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrationFormAppApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(RegistrationFormAppApplication.class, args);
		System.out.println("end");
	}

}
