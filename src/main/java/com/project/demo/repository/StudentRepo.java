package com.project.demo.repository;

import com.project.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  StudentRepo extends JpaRepository<StudentEntity,Integer> {
}
