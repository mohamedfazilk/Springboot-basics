package com.packt.cardbase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.cardbase.domain.Car;
import com.packt.cardbase.domain.CarRepository;

@RestController
public class CartController {
	@Autowired
	private CarRepository repository;
	@RequestMapping("/cars")
	public Iterable<Car> getCars(){
		return repository.findAll();
	}

}
