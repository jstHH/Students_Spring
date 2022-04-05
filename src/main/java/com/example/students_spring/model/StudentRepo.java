package com.example.students_spring.model;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentRepo {
    Map<String, Student> students = new HashMap<>();

    public StudentRepo() {
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public Student getStudentbyID(String id) {
        return students.get(id);
    }

    public boolean addStudent(Student newStudent) {
        students.put(newStudent.getID(), newStudent);
        if (students.get(newStudent.getID()).equals(newStudent)) {
            return true;
        }
        return false;
    }

    public void deleteStudentByID(String id) {
        students.remove(id);
    }
}
