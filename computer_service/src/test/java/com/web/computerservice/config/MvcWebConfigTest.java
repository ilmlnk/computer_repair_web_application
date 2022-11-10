package com.web.computerservice.config;

import com.web.computerservice.ComputerServiceApplication;
import com.web.computerservice.repo.RequestRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@TestPropertySource(
        locations = "classpath:application.properties"
)
@SpringBootTest(
        classes = ComputerServiceApplication.class
)
@AutoConfigureMockMvc
class MvcWebConfigTest {

    @Autowired
    private MvcWebConfig mvcWebConfig;

    @Autowired
    private RequestRepository requestRepository;
}