package com.packt.cardbase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.packt.cardbase.domain.Owner;
import com.packt.cardbase.domain.OwnerRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class OwnerRepositoryTest {
	@Autowired
	private OwnerRepository ownerrepository;
	
	@Test
	void saveOwner() {
		ownerrepository.save(new Owner("Mohamed", "Fazil"));
		assertThat(ownerrepository.findByFirstname("Mohamed").isPresent())
		.isTrue();
	}
	
	@Test
	void deleteOwner() {
		ownerrepository.save(new Owner("Lisa", "Fatrhima"));
		ownerrepository.deleteAll();
		assertThat(ownerrepository.count()).isEqualTo(0);
	}
}
