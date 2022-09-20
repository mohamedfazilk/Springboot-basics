package com.packt.cardbase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
	@Query("select c from Owner c where c.firstname=firstname")
	List<Owner> findByName(String firstname);

}
