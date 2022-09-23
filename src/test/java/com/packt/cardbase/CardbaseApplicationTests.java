package com.packt.cardbase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import com.packt.cardbase.web.CartController;

@SpringBootTest
class CardbaseApplicationTests {
	
	@Autowired 
	private CartController carcontroller;
	
	@Test
	@DisplayName("first example test case")
	void contextLoads() {
		assertThat(carcontroller).isNotNull();
	}

}
