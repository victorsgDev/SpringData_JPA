package com.example.spring_jpadata_tutorial.repository;

import com.example.spring_jpadata_tutorial.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
