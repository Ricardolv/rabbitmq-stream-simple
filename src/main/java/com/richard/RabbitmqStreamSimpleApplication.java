package com.richard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@EnableRetry
@SpringBootApplication
public class RabbitmqStreamSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqStreamSimpleApplication.class, args);
	}

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
}
