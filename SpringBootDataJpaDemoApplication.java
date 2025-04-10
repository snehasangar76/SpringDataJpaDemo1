package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class SpringBootDataJpaDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap = SpringApplication.run(SpringBootDataJpaDemoApplication.class, args);
		EmployeeService es =  ap.getBean(EmployeeService.class);
		es.saveEmployeeData();
		
	}

}
