package com.example.students_spring.controller;

import com.example.students_spring.StudentsSpringApplication;
import com.example.students_spring.model.Student;
import com.example.students_spring.model.StudentRepo;
import com.example.students_spring.model.StudentService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class StudentControllerTest {
    StudentService studentService = mock(StudentService.class);
    StudentController controller = new StudentController(studentService);


    @Test
    void getStudent() {
        //Given

    }

    @Test
    void getStudentByID() {
    }

    @Test
    void addStudent() {
    }

    @Test
    void deleteStudent() {
    }
}