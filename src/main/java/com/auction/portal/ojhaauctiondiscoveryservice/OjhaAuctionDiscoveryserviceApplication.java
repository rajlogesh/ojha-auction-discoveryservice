package com.auction.portal.ojhaauctiondiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OjhaAuctionDiscoveryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OjhaAuctionDiscoveryserviceApplication.class, args);
	}

}
