package com.example.CloudGatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.client.circuitbreaker.Customizer;

@SpringBootApplication
public class CloudGatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatwayApplication.class, args);

	}

}
