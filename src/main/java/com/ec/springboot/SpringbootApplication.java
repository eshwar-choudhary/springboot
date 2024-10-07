package com.ec.springboot;

import com.ec.springboot.constructorInjection.services.HumanService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {


		// Cosntructor Injection
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		HumanService humanService = context.getBean(HumanService.class);
		humanService.printHumanStatus();



	}

}
