package org.marcos.discoveryservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscoveryService1Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryService1Application.class, args);
	}

}
