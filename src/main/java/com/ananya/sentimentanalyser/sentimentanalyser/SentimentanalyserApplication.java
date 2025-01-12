package com.ananya.sentimentanalyser.sentimentanalyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ananya.sentimentanalyser.sentimentanalyser.controller")
@ComponentScan(basePackages = "com.ananya.sentimentanalyser.sentimentanalyser.service")
public class SentimentanalyserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentimentanalyserApplication.class, args);
	}

}
