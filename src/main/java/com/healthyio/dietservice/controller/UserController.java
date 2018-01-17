package com.healthyio.dietservice.controller;

import com.healthyio.dietservice.bean.User;
import com.healthyio.dietservice.repository.UserRepository;
import com.healthyio.dietservice.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getById(@PathVariable int id){
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
