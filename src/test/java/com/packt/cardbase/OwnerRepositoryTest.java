package com.packt.cardbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.packt.cardbase.domain.OwnerRepository;

@DataJpaTest
public class OwnerRepositoryTest {
	@Autowired
	private OwnerRepository ownerrepository;
}
