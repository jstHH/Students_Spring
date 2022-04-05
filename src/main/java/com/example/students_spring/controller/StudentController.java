package com.example.students_spring.controller;

import com.example.students_spring.model.Student;
import com.example.students_spring.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("studentcontroller")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudentsAsArrayList();
    }

    @GetMapping(path = "{id}")
    public Student getStudentByID(@PathVariable String id) {
        return studentService.getStudentbyID(id);
    }

    @PostMapping
    public boolean addStudent(@RequestBody Student newStudent) {
        return studentService.addStudent(newStudent);
    }

    @PostMapping(path = "{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudentByID(id);
    }
}
