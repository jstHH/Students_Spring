package com.example.students_spring.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class StudentService {
    StudentRepo studentRepo = new StudentRepo();

    public StudentService() {
    }

    public Map<String, Student> getStudents() {
        return studentRepo.getStudents();
    }

    public Student getStudentbyID(String id) {
        return studentRepo.getStudentbyID(id);
    }

    public void addStudent(Student newStudent) {
        studentRepo.addStudent(newStudent);
    }

    public List<Student> getStudentsAsArrayList() {
       return new ArrayList<Student>(getStudents().values());
    }

    public void deleteStudentByID(String id) {
        studentRepo.deleteStudentByID(id);
    }
}
