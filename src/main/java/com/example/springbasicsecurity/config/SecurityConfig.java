package com.example.springbasicsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig extends WebSecurityConfiguration {
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder)
    {
        UserDetails admin = User.withUsername("Ram")
                .password(passwordEncoder.encode("Ram123")).
                roles("ADMIN")
                .build();
        UserDetails user = User.withUsername("Apple")
                .password(passwordEncoder.encode("Apple123")).
                roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin,user);
    }
    @Bean
    PasswordEncoder getPasswordEncoder ()
    {
        return new BCryptPasswordEncoder();
    }
}
