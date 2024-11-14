package com.project.demo.service;

import com.project.demo.entity.StudentEntity;
import com.project.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentEntity saved(StudentEntity studentEntity) {

        return studentRepo.save(studentEntity);
    }

    public List<StudentEntity> getAll() {
        return studentRepo.findAll();
    }
}

