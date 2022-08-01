package com.example.demo;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansExample {

	@Bean
	public String greeting() {
		LocalTime time = LocalTime.now();
		return "Time: " + time;
	}
	
}
