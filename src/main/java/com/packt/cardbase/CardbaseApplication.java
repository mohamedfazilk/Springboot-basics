package com.packt.cardbase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardbaseApplication {
	
	private static final Logger logger =LoggerFactory.getLogger
			(CardbaseApplication.class);
	

	public static void main(String[] args) {
		 
		SpringApplication.run(CardbaseApplication.class, args);
		logger.info("Application started now");
	}

}
