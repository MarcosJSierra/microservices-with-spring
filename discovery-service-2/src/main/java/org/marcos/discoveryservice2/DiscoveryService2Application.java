package org.marcos.discoveryservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscoveryService2Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryService2Application.class, args);
	}

}
