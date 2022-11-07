package com.web.computerservice;

import com.web.computerservice.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class ComputerServiceApplicationTests {
	private HomeController homeController;

	public ComputerServiceApplicationTests(HomeController homeController) {
		this.homeController = homeController;
	}

	@Test
	void contextLoads() {
		assertThat(homeController).isNotNull();
	}

}
