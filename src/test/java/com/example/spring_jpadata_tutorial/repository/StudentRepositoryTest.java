package com.example.spring_jpadata_tutorial.repository;

import com.example.spring_jpadata_tutorial.entity.Guardian;
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
                //.guardianName("Juan")
                //.guardianEmail("juanl@gmail.com")
                //.guardianMobile("9999999999")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("manolo@gmail.com")
                .name("Manolo")
                .mobile("9999956324")
                .build();

        Student student = Student.builder()
                .firstName("Carlos")
                .emailId("carlos@gmail.com")
                .lastName("García")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName() {

        List<Student> students =
                studentRepository.findByFirstName("Carlos");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining() {

        List<Student> students =
                studentRepository.findByFirstNameContaining("ct");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students =
                studentRepository.findByGuardianName("Manolo");
        System.out.println("students = " + students);
    }

    @Test
    public void printgetStudentByEmailAddress() {
        Student student =
                studentRepository.getStudentByEmailAddress(
                        "victorsg.dev@gmail.com"
                );

        System.out.println("student = " + student);
    }
    @Test
    public void printgetStudentFirstNameByEmailAddress() {
        String firstName =
                studentRepository.getStudentFirstNameByEmailAddress(
                        "victorsg.dev@gmail.com"
                );
        System.out.println("firstName = " + firstName);
    }


}