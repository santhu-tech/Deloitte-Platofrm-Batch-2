package com.example.CloudGatway.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

//@Configuration
@EnableWebFluxSecurity
public class OktaOAuth2WebSecurity {
    @Bean
    public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity http){
        http
                .authorizeExchange(exchanges -> exchanges
                        .anyExchange()
                        .authenticated())
                .oauth2ResourceServer(oauth2 -> oauth2
                        .jwt(withDefaults()));  // Enable JWT validation
        return http.build();
    }

}






