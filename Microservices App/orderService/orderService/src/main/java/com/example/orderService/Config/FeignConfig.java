package com.example.orderService.Config;

import com.example.orderService.External.Decoder.CustomErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration

public class FeignConfig {


        @Bean
        ErrorDecoder errorDecoder() {
            return new CustomErrorDecoder();
        }
    }

