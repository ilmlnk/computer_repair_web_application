package com.web.computerservice.config;


import com.web.computerservice.service.RequestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    private final RequestService requestService;

    public SecurityConfig(RequestService requestService) {
        this.requestService = requestService;
    }

    /*@Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails userDetails = User.withUsername("admin")
                .password(passwordEncoder().encode("adminPass"))
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(userDetails);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/admin/**")
                .hasRole("ADMIN")
                .antMatchers("/anonymous*")
                .anonymous()
                .antMatchers("/login*")
                .permitAll()
                .anyRequest()
                .authenticated();

        return http.build();
    }*/

}
