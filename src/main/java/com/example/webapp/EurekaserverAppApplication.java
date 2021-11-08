package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverAppApplication.class, args);
	}

}
