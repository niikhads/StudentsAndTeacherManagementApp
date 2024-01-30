package org.example.controller;

import org.example.dto.request.AddTeacherRequest;
import org.example.dto.response.GetTeacherResponse;
import org.example.service.TeacherService;
import org.example.service.impl2.TeacherServiceImpl;
import org.example.service.impl2.TeacherServiceImpl;

import java.util.List;

public class TeacherController {

    private static final TeacherController INSTANCE = new TeacherController();
    private final TeacherService teacherService = TeacherServiceImpl.getInstance();

    private TeacherController() {}

    public static TeacherController getInstance() {
        return INSTANCE;
    }

    public void addTeacher(AddTeacherRequest request) {
        teacherService.addTeacher(request);
    }

    public List<GetTeacherResponse> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

}