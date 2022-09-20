package com.packt.cardbase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarRepository  extends CrudRepository<Car, Long>{
	
	
	@Query("select c from Car c where c.brand=?1")
	List<Car> findByBrand(String brand);

}
