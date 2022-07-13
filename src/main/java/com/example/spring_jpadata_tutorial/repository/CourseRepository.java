package com.example.spring_jpadata_tutorial.repository;


import com.example.spring_jpadata_tutorial.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    Page<Course> findByTitleContaining(
            String title,
            Pageable pageable);
}