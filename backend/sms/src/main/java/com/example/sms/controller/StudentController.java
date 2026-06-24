package com.example.sms.controller;

import org.springframework.web.bind.annotation.*;
import com.example.sms.model.Student;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {

    @GetMapping
    public Student getStudent() {
        return new Student(1, "abc", "java");

    }
}
