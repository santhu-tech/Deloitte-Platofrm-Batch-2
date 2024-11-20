package com.crud.crud.application.controller;

import com.crud.crud.application.exception.UserNotFoundException;
import com.crud.crud.application.Entity.User;
import com.crud.crud.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/employees")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/employees")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id).map(user -> {
            user.setphoneNumber(newUser.getphoneNumber());
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            return userRepository.save((user));
        }).orElseThrow(() -> new UserNotFoundException(id));
    }
    @DeleteMapping("/employees/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id)){
            throw new  UserNotFoundException(id);

        }
        userRepository.deleteById(id);
        return "user with id " +id+ "has been deleted successfylly";

    }

}


