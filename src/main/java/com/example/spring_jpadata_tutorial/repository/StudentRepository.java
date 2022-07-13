package com.example.spring_jpadata_tutorial.repository;

import com.example.spring_jpadata_tutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
