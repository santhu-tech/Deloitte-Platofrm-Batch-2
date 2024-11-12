package com.SpringBoot.Ecommerce.Product.Controller;

import com.SpringBoot.Ecommerce.Product.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //@controller+@ResponseBody
@RequestMapping("/api")
public class Sample {

    @GetMapping("/welcome")    //get//Read, post //writing ,put //update ,delete //delete
    public String Welcome(){
        return "Welcome to the Spring Boot Module";
    }

    @GetMapping("/user")   //@RequestMapping
    public User user() {
        User user =new User();
        user.setId("1");
        user.setName("Santhiya");
        user.setEmailId("Santhiya@xyz.com");
        return  user;
    }
    @GetMapping("user/{id}/{name}")
    public String pathVariable(@PathVariable String id,
                               @PathVariable String name){
        return "The path Variable is" + id + ": "  +name;
    }



}
