package com.saichanthrakumar.microservices.gorden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.saichanthrakumar.microservices.gorden.service.EaterService;

import lombok.extern.log4j.Log4j;

/**
 * @author SAI CHANTHRA KUMAR
 *
 */
@Log4j
@SpringBootApplication
public class GordenApplication {
	@Autowired
	EaterService eatery;

	@Bean
	public CommandLineRunner run() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				log.debug("Application Bootstrapped!");
			}
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(GordenApplication.class, args);
	}
}
