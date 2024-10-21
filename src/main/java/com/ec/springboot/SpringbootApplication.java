package com.ec.springboot;

import com.ec.springboot.constructorInjection.services.HumanService;
import com.ec.springboot.injectingValues.*;
import com.ec.springboot.injectingValues.prefixMatching.MatchPrefix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		// Constructor Injection
		HumanService humanService = context.getBean(HumanService.class);
		humanService.printHumanStatus();

		/*
		 * Injecting Values  from
		 * application.properties,
		 * Default Values,
		 * Environment Variables,
		 * Direct Values,
		 * Lists and Arrays
		 */
		// Injecting Values from application.properties
		PropertiesFile propertiesFile = context.getBean(PropertiesFile.class);
		String applicationName = propertiesFile.getApplicationName();
        System.out.println("Application Name: " + applicationName);

		// Injecting Default Values
		DefaultValue defaultValue = context.getBean(DefaultValue.class);
		String greeting = defaultValue.getGreeting();
		System.out.println("Greeting: " + greeting);

		// Injecting Environment Variables
		String host = System.getenv("HOSTNAME");
		System.out.println("Host : " + host);
		EnvVariable env = context.getBean(EnvVariable.class);
		System.out.println("Host Name: " + env.getHostName());

		// Injecting Direct Values
		String directValue = context.getBean(LiteralValue.class).getGreet();
		System.out.println("Direct Value: " + directValue);

		// Injecting Lists and Arrays
		List<String> fruits = context.getBean(ListsAndArrays.class).getFruits();
		StringJoiner joiner = new StringJoiner(", ");
		fruits.forEach(joiner::add);
		System.out.println("Fruits: " + joiner);

		// Injecting Lists and Arrays with Default Values
		List<String> vegetables = context.getBean(ListsAndArrays.class).getVegetables();
		joiner = new StringJoiner(", ");
		vegetables.forEach(joiner::add);
		System.out.println("Vegetables: " + joiner);


		// Injecting Arrays
		String[] bikes = context.getBean(ListsAndArrays.class).getBikes();
		joiner = new StringJoiner(", ");
		for (String bike : bikes) {
			joiner.add(bike);
		}
		System.out.println("Bikes: " + joiner);

		//Matching Prefix
		MatchPrefix matchPrefix = context.getBean(MatchPrefix.class);
		System.out.println("Matched Prefix: " + matchPrefix.getPort());
		System.out.println("Matched Prefix: " + matchPrefix.getPort1());

	}

}
