package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(EurekaNamingServerApplication.class, args);
	}
	
}