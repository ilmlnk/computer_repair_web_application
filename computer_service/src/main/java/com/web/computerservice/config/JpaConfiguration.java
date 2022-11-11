package com.web.computerservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.web.computerservice.repo")
@EnableTransactionManagement
public class JpaConfiguration {
    private final Environment environment;

    public JpaConfiguration(Environment environment) {
        this.environment = environment;
    }
}
