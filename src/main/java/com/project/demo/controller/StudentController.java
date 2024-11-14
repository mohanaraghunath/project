package com.project.demo.controller;

import com.project.demo.entity.StudentEntity;
import com.project.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/post")
    public StudentEntity postmethod(@RequestBody StudentEntity studentEntity){

        return service.saved(studentEntity);
    }
    @GetMapping("/getall")
    public List<StudentEntity> getAllStudents() {
        return service.getAll();

}

}
