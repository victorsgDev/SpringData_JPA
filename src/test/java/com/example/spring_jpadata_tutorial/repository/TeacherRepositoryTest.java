package com.example.spring_jpadata_tutorial.repository;

import com.example.spring_jpadata_tutorial.entity.Course;
import com.example.spring_jpadata_tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher() {

        Course coursePhp = Course.builder()
                .title("PHP")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .title("Java")
                .credit(6)
                .build();

        Teacher teacher =
                Teacher.builder()
                        .firstName("Víctor")
                        .lastName("Sánchez")
                        //.courses(List.of(courseDBA,courseJava))
                        .build();

        teacherRepository.save(teacher);
    }
}