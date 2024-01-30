package org.example.repository;

import org.example.dto.response.GetTeacherResponse;
import org.example.entity.Teacher;

import java.util.List;

public interface TeacherRepository {
    // A -> B

    void addTeacher(Teacher teacher);
    List<Teacher> getAllTeachers();

}