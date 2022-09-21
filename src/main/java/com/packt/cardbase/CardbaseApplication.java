package com.packt.cardbase;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packt.cardbase.domain.Car;
import com.packt.cardbase.domain.CarRepository;
import com.packt.cardbase.domain.Owner;
import com.packt.cardbase.domain.OwnerRepository;
import com.packt.cardbase.domain.User;
import com.packt.cardbase.domain.UserRepository;

@SpringBootApplication
public class CardbaseApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(CardbaseApplication.class);

	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository orepository;

	@Autowired
	private UserRepository userrepository;

	public static void main(String[] args) {

		SpringApplication.run(CardbaseApplication.class, args);
		logger.info("Application started now");
	}

	@Override
	public void run(String... args) throws Exception {
		userrepository.save(new User("user", "$2a$12$Kxvwn/WD.HBSQhuLsGfMj.o3qO5z5ICZAOmR77zsEfPu9H6cuGryi", "USER"));
		userrepository.save(new User("admin", "4y0h9WnLw/TjWXpwK9EZ4D7WCZaB9s/2U/sPcnup1do=", "ADMIN"));
	}
	

		// Add owner objects and save these to db

//		Owner owner1 = new Owner(1,"jhon", "jhonson");
//		Owner owner2 = new Owner(2,"Mary" , "Robinson");
//		 orepository.saveAll(Arrays.asList(owner1,owner2));
////		 
//		// Add car object and link to owners and save  these to db
//		
//		
//		 
//		 Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000, owner1);
//		 Car car2 = new Car("Nissan", "Leaf", "White","SSJ-3002", 2019, 29000, owner2);
//		 Car car3 = new Car("Toyota", "Prius", "Silver","KKO-0212", 2020, 39000, owner2);
//		 repository.saveAll(Arrays.asList(car1, car2,car3));
////		
//		 for (Car car : repository.findAll()) {
//			 logger.info(car.getBrand() + "" +car.getModel());
//			 }

		// Username: user, password: user
	



}
