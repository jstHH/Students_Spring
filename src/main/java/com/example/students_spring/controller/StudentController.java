package com.example.students_spring.controller;

import com.example.students_spring.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("studentcontroller")
public class StudentController {

    @GetMapping
    public List<Student> getStudent() {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Hans Hansen", 123));
//        students.add(new Student("Klaus Klausen", 456));

        return List.of(new Student("Peter Petersen", 321), new Student("Jan Jansen", 987));
    }
}
