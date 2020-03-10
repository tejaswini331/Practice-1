package com.practice.Test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan({"com.practice.controller1","com.practice.service1","com.practice.repository"})
public class Test1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}
