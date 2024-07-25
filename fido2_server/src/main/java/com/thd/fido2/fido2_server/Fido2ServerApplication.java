package com.thd.fido2.fido2_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Configuration
@EnableJpaRepositories(basePackages = "com.thd.fido2.fido2_server.repository")
@SpringBootApplication
@EntityScan(basePackages = "com.thd.fido2.fido2_server.entity")
public class Fido2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fido2ServerApplication.class, args);
	}

}
