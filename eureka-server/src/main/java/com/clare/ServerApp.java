package com.clare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;  

@EnableEurekaServer
//@SpringBootConfiguration
//@Configuration
//@ServletComponentScan
//@EnableAutoConfiguration 
@SpringBootApplication

public class ServerApp { 
	public static void main(String[] args) {
		System.out.println( "ServerApp!" );
		SpringApplication.run(ServerApp.class, args);
	}
} 
