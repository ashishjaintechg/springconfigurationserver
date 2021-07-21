package com.test.configserver.com.test.configserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import jdk.jfr.Enabled;

@SpringBootApplication
@EnableConfigServer
public class SpringconfigurationserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringconfigurationserverApplication.class, args);
	}

}
