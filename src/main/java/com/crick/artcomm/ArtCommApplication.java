package com.crick.artcomm;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ArtCommApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtCommApplication.class, args);
	}

	@RequestMapping(value = "/user")
	public Principal user(Principal principal) {
		return principal;
	}
	
}
