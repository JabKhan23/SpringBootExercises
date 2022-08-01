package com.example.demo;


import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeansExample2 {

	  @Bean
	  @Scope("prototype")
	  public String farewell() {
			LocalTime time = LocalTime.now();
			return "Time: " + time;
	   }
}
	

