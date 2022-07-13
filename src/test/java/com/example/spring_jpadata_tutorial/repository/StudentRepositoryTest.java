package com.example.spring_jpadata_tutorial.repository;

import com.example.spring_jpadata_tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("victorsg.dev@gmail.com")
                .firstName("Víctor")
                .lastName("Sánchez")
                .guardianName("Juan")
                .guardianEmail("juanl@gmail.com")
                .guardianMobile("9999999999")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }

}