package org.example.service.impl;

import org.example.dto.request.AddStudentRequest;
import org.example.dto.response.GetStudentResponse;
import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.example.repository.StudentRepository;
import org.example.repository.impl.StudentRepositoryImpl;
import org.example.service.StudentService;
import org.example.util.IdGeneratorUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private static final StudentServiceImpl INSTANCE = new StudentServiceImpl();
    private final StudentRepository studentRepository = StudentRepositoryImpl.getInstance();
    private final StudentMapper studentMapper = StudentMapper.getInstance();

    private StudentServiceImpl() {}

    public static StudentServiceImpl getInstance() {
        return INSTANCE;
    }

    public void addStudent(AddStudentRequest request) {
        Student student = studentMapper.toStudent(request);
        student.setId(IdGeneratorUtil.getNewStudentId());

        StudentRepositoryImpl.getInstance().addStudent(student);
    }

    public List<GetStudentResponse> getAllStudents() {
        List<Student> students = studentRepository.getAllStudents();
        return studentMapper.toGetStudentResponseList(students);
    }
}