package com.example.student_pack.controller;

import com.example.student_pack.domain.Student;
import com.example.student_pack.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class FilterController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/{name}")
    public Student getStdByName(@PathVariable(name = "name") String name){
      return null;
    }
}
