package org.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@AutoConfiguration
//@ComponentScan
public class MoviesInfoApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(MoviesInfoApplication.class);
	}

}
