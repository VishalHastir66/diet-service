package com.healthyio.dietservice.controller;

import com.healthyio.dietservice.bean.Diet;
import com.healthyio.dietservice.bean.User;
import com.healthyio.dietservice.repository.DietRepository;
import com.healthyio.dietservice.repository.UserRepository;
import com.healthyio.dietservice.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DietController {


    @Autowired
    private DietRepository dietRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDaoService userDaoService;

    @PostMapping("/users/{id}/genereate")
    public ResponseEntity<String> saveDiet(@PathVariable Integer id, @RequestBody Diet diet){
        User savedUser = userDaoService.findById(id);
        diet.setUser(savedUser);
        dietRepository.save(diet);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/diets")
    public List<Diet> findAll(){
        return dietRepository.findAll();
    }
}
