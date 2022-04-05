package com.example.students_spring.model;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;


class StudentServiceTest {
    StudentRepo studentRepo = mock(StudentRepo.class);
    StudentService studentService = new StudentService(studentRepo);

    @Test
    void getStudents() {
        //Given
        when(studentRepo.getStudents()).thenReturn(Map.of("123", new Student("Hans", "123"), "456", new Student("Peter", "456")));

        //When
        Map<String, Student> actual = studentService.getStudents();

        //Then
        Map<String, Student> expected = Map.of("123", new Student("Hans", "123"), "456", new Student("Peter", "456"));

        verify(studentRepo).getStudents();
        assertEquals(expected, actual);
    }

    @Test
    void getStudentbyID() {
        //Given
        when(studentRepo.getStudentbyID("123")).thenReturn(new Student("Peter", "123"));

        //When
        Student actual = studentService.getStudentbyID("123");

        //Then
        Student expected = new Student("Peter", "123");

        verify(studentRepo).getStudentbyID("123");
        assertEquals(expected, actual);

    }

    @Test
    void addStudent() {
        Student tesstudent = new Student("Peter", "123");
        //Given
        when(studentRepo.addStudent(tesstudent)).thenReturn(true);

        //When

        //Then
        assertTrue(studentService.addStudent(new Student("Peter", "123")));
        verify(studentRepo).addStudent(new Student("Peter", "123"));
    }

    @Test
    void getStudentsAsArrayList() {
        //Given
        when(studentRepo.getStudents()).thenReturn(Map.of("123", new Student("Hans", "123"), "456", new Student("Peter", "456")));

        //When
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Peter", "456"));
        expected.add(new Student("Hans", "123"));

        //Then
        List<Student> actual = studentService.getStudentsAsArrayList();

        verify(studentRepo).getStudents();
        assertEquals(expected, actual);

    }

    @Test
    void getStudentByName_whenIDValidReturnOptionalOfStudent() {
        //Given
        when(studentRepo.getStudents()).thenReturn(Map.of("123", new Student("Hans", "123"), "456", new Student("Peter", "456")));

        //When
        Optional<Student> expected = Optional.of(new Student("Hans", "123"));

        //Then
        Optional<Student> actual = studentService.getStudentByName("Hans");

        verify(studentRepo).getStudents();
        assertEquals(expected, actual);
    }

    @Test
    void getStudentByName_whenIDInvalidReturnOptionalEmpty() {
        //Given
        when(studentRepo.getStudents()).thenReturn(Map.of("123", new Student("Hans", "123"), "456", new Student("Peter", "456")));

        //When
        Optional<Student> expected = Optional.empty();

        //Then
        Optional<Student> actual = studentService.getStudentByName("XXX");

        verify(studentRepo).getStudents();
        assertEquals(expected, actual);
    }

}