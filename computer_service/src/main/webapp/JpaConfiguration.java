package com.web.computerservice.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackages = "com.web.computerservice.repo")
@EnableTransactionManagement
public class JpaConfiguration {
    private final Environment environment;

    public JpaConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Value("${datasource.repairapp.maxPoolSize:10}")
    private int maxPoolSize;


    /*
    * Populate SpringBoot DataSourceProperties object directly
    * from application.properties based on prefix.
    * */
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "datasource.repairapp")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    /*
    * Configure HikariCP pooled DataSource.
    * */

    @Bean
    public DataSource dataSource() {
        DataSourceProperties dataSourceProperties = dataSourceProperties();
        HikariDataSource dataSource = DataSourceBuilder
                .create(dataSourceProperties.getClassLoader())
                .driverClassName(dataSourceProperties.getDriverClassName())
                .url(dataSourceProperties.getUrl())
                .username(dataSourceProperties.getUsername())
                .password(dataSourceProperties.getPassword())
                .type(HikariDataSource.class)
                .build();
        dataSource.setMaximumPoolSize(maxPoolSize);
        return dataSource;
    }

    /*
    * Entity Manager Factory setup
    * */

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("com.web.computerservice.model");
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        factoryBean.setJpaProperties(jpaProperties());
        return factoryBean;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        return hibernateJpaVendorAdapter;
    }

    private Properties jpaProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect",
                environment.getRequiredProperty("datasource.repairapp.hibernate.dialect"));
        properties.put("hibernate.hbm2ddl.auto",
                environment.getRequiredProperty("datasource.repairapp.hibernate.hbm2ddl.method"));
        properties.put("hibernate.show_sql",
                environment.getRequiredProperty("datasource.repairapp.hibernate.show_sql"));
        properties.put("hibernate.format_sql",
                environment.getRequiredProperty("datasource.repairapp.hibernate.format_sql"));
        if(StringUtils.isNotEmpty(environment.getRequiredProperty("datasource.repairapp.defaultSchema"))){
            properties.put("hibernate.default_schema",
                    environment.getRequiredProperty("datasource.repairapp.defaultSchema"));
        }
        return properties;
    }

    @Bean
    @Autowired
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(emf);
        return txManager;
    }

}
