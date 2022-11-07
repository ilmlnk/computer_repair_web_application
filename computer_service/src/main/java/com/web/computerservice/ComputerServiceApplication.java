package com.web.computerservice;

import com.web.computerservice.model.Request;
import com.web.computerservice.repo.RequestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@SpringBootApplication
public class ComputerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(RequestRepository requestRepository) {
		return args -> {
			Request request = new Request("Illia", "Melnyk",
					"+380970894434", LocalDate.now(), LocalTime.now());
			requestRepository.save(request);
		};
	}

}
