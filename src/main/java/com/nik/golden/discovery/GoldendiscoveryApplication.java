package com.nik.golden.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaServer
@CrossOrigin("http://localhost:3000/")
public class GoldendiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldendiscoveryApplication.class, args);
	}

}
