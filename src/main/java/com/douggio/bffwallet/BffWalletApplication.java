package com.douggio.bffwallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BffWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffWalletApplication.class, args);
	}

}
