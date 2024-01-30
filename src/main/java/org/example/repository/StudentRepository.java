package org.example.repository;

import org.example.entity.Student;

import java.util.List;

public interface StudentRepository {
    // A -> B

    void addStudent(Student student);
    List<Student> getAllStudents();

}