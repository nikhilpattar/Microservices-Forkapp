package com.forkapp.laptopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LaptopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopServiceApplication.class, args);
	}

}
