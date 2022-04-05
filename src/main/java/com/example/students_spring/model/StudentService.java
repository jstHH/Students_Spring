package com.example.students_spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Map<String, Student> getStudents() {
        return studentRepo.getStudents();
    }

    public Student getStudentbyID(String id) {
        return studentRepo.getStudentbyID(id);
    }

    public boolean addStudent(Student newStudent) {
        return studentRepo.addStudent(newStudent);
    }

    public List<Student> getStudentsAsArrayList() {
       return new ArrayList<Student>(getStudents().values());
    }

    public Optional<Student> getStudentByName(String name) {
        List<Student> students = getStudentsAsArrayList();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public void deleteStudentByID(String id) {
        studentRepo.deleteStudentByID(id);
    }
}
