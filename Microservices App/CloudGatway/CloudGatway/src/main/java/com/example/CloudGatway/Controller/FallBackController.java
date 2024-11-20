package com.example.CloudGatway.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallBack(){
        return "OrderService is down";
    }
    @GetMapping("/productServiceFallBack")
    public String productServiceFallBack(){
        return "ProductService is down";
    }
}
