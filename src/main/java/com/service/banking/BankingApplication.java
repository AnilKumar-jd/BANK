package com.service.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
@RestController
public class BankingApplication {

	public static void main(String[] args) {
		System.out.println("Application is Starting ............");
		SpringApplication.run(BankingApplication.class, args);

	}

// to create war file....
	// extends SpringBootServletInitializer and ovride below method.........

	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(BankingApplication.class); }
	 */

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World from bank bccs";
	}
}
