package com.kfl.demo.controller;

import com.kfl.demo.model.Users;
import com.kfl.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {
    @Autowired
    DemoRepository demoRepository;

    // Get All Users
    @GetMapping("/getAllUsers")
    public List<Users> getAllUsers() {
        return demoRepository.findAll();
    }

    // Create a new User
    @PostMapping("/createUser")
    public Users createUser(@Valid @RequestBody Users users) {
        return demoRepository.save(users);
    }
}
