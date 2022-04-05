package com.example.students_spring.controller;

import com.example.students_spring.model.Student;
import com.example.students_spring.model.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("studentcontroller")
public class StudentController {
    StudentService studentService = new StudentService();

    @GetMapping
    public List<Student> getStudent() {
     return studentService.getStudentsAsArrayList();
    }

    @GetMapping(path = "{id}")
    public Student getStudentByID(@PathVariable String id) {
        return studentService.getStudentbyID(id);
    }

    @PostMapping
    public void addStudent(@RequestBody Student newStudent) {
        studentService.addStudent(newStudent);
    }

    @PostMapping(path = "{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudentByID(id);
    }
}
