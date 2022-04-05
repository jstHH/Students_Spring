package com.example.students_spring.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void addStudent(Student newStudent) {
        students.put(newStudent.getID(), newStudent);
    }

    public void deleteStudentByID(String id) {
        students.remove(id);
    }
}
