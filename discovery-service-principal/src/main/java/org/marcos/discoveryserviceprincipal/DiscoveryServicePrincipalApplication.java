package org.marcos.discoveryserviceprincipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class DiscoveryServicePrincipalApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getresttempalte(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServicePrincipalApplication.class, args);
	}

}
