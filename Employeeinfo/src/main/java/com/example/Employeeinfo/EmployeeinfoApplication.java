package com.example.Employeeinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication

public class EmployeeinfoApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeinfoApplication.class, args);
	}
}
