package com.packt.cardbase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long>{
	

}
