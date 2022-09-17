package com.packt.cardbase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packt.cardbase.domain.Car;
import com.packt.cardbase.domain.CarRepository;

@SpringBootApplication
public class CardbaseApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(CardbaseApplication.class);

	@Autowired
	private CarRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(CardbaseApplication.class, args);
		logger.info("Application started now");
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Car(1,"Ford", "Mustang", "Red",
				"ADF-WW", 2021, 78898990));
		
		repository.save(new Car(2,"Nissan", "Leaf","White",
				 "SSJ-3002", 2019, 29000));

	}

}
