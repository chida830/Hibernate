package com.example.Spring_Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.example.Spring_Employee")
@EnableJpaRepositories(basePackages ={"com.example.Spring_Employee_repository"})
@EntityScan(basePackages={"com.example.Spring_Employee_Entity"})
public class SpringEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeApplication.class, args);
		System.out.println("Hi");
	}

}
