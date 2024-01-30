package org.example.service.impl2;


import org.example.dto.request.AddTeacherRequest;
import org.example.dto.response.GetTeacherResponse;
import org.example.entity.Teacher;
import org.example.mapper.TeacherMapper;
import org.example.repository.TeacherRepository;
import org.example.repository.impl2.TeacherRepositoryImpl;
import org.example.service.TeacherService;
import org.example.util.IdGeneratorUtil;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private static final org.example.service.impl2.TeacherServiceImpl INSTANCE = new org.example.service.impl2.TeacherServiceImpl();
    private final TeacherRepository teacherRepository = TeacherRepositoryImpl.getInstance();
    private final TeacherMapper teacherMapper= TeacherMapper.getInstance();

    private TeacherServiceImpl() {}

    public static org.example.service.impl2.TeacherServiceImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public void addTeacher(AddTeacherRequest request) {
        Teacher teacher = teacherMapper.toTeacher(request);
        teacher.setId(IdGeneratorUtil.getNewTeacherId());

        TeacherRepositoryImpl.getInstance().addTeacher(teacher);
    }

    @Override
    public List<GetTeacherResponse> getAllTeachers() {
        List<Teacher> teachers = teacherRepository.getAllTeachers();
        return  teacherMapper.toGetTeacherResponseList(teachers);
    }
}

