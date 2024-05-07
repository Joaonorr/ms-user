package com.ms.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		System.out.println('a'*333);
		SpringApplication.run(UserApplication.class, args);
	}

}
