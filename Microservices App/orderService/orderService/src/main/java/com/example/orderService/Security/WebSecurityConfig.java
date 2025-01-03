package com.example.orderService.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalAuthentication
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityWebFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeRequests(
                        authorizeRequest -> authorizeRequest
                                .anyRequest()
                                .authenticated())
                .oauth2ResourceServer(oauth2->
                        oauth2.jwt(jwt -> {
                            // Additional JWT configurations can be added here if needed
                        })
                );

        return http.build();

    }
}
