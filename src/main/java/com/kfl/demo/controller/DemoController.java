package com.kfl.demo.controller;

import com.kfl.demo.model.Users;
import com.kfl.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {
    @Autowired
    DemoRepository demoRepository;

    @GetMapping("/notes")
    public List<Users> getAllNotes() {
        return demoRepository.findAll();
    }
}
