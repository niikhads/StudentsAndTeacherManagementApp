package org.example.service;

import org.example.dto.request.AddTeacherRequest;
import org.example.dto.response.GetTeacherResponse;

import java.util.List;

public interface TeacherService {

    void addTeacher(AddTeacherRequest request);
    List<GetTeacherResponse> getAllTeachers();

}