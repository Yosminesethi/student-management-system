package com.example.sms.controller;

import org.springframework.web.bind.annotation.*;
import com.example.sms.model.Student;
import java.util.ArrayList;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {

    @GetMapping
    public ArrayList<Student> getStudent() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Pari", "Java"));
        students.add(new Student(2, "Yosmine", "Python"));

        return students;

    }
}
