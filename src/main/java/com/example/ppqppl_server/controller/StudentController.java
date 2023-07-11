package com.example.ppqppl_server.controller;

import com.example.ppqppl_server.entity.Student;
import com.example.ppqppl_server.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/student")
    public List<Student> student(){
        return studentRepository.findAll();
    }

}
