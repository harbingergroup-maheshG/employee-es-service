package com.hspl.employee_es_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@SpringBootApplication(scanBasePackages = "com.hspl.employee_es_service")
public class EmployeeEsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeEsServiceApplication.class, args);
	}

}
