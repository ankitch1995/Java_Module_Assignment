package com.cybage.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cybage")
public class SpringMvcBmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcBmsApplication.class, args);
	}

}
