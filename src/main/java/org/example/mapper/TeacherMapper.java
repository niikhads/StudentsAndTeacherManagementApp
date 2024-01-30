package org.example.mapper;

import org.example.dto.request.AddTeacherRequest;
import org.example.dto.response.GetTeacherResponse;
import org.example.entity.Teacher;
import org.example.util.DateUtil;
import org.example.util.IdGeneratorUtil;

import java.util.ArrayList;
import java.util.List;

public class TeacherMapper {

    private static final TeacherMapper INSTANCE = new TeacherMapper();

    private TeacherMapper() {}

    public static TeacherMapper getInstance() {
        return INSTANCE;
    }

    public Teacher toTeacher(AddTeacherRequest addTeacherRequest) {
        Teacher teacher = new Teacher();
        teacher.setName(addTeacherRequest.getName());
        teacher.setSurname(addTeacherRequest.getSurname());
        teacher.setBirthDate(
                DateUtil.toLocalDate(
                        addTeacherRequest.getBirthDate()
                )
        );

        return teacher;
    }

    public List<GetTeacherResponse> toGetTeacherResponseList(List<Teacher> teacherList) {
        List<GetTeacherResponse> getTeacherResponseList = new ArrayList<>();

        for (Teacher teacher: teacherList) {
            GetTeacherResponse getTeacherResponse = new GetTeacherResponse();
            getTeacherResponse.setId(teacher.getId());
            getTeacherResponse.setSubject(teacher.getSubject());
            getTeacherResponse.setName(teacher.getName());
            getTeacherResponse.setSurname(teacher.getSurname());
            getTeacherResponse.setBirthDate(
                    DateUtil.toString(
                            teacher.getBirthDate()
                    )
            );
            getTeacherResponseList.add(getTeacherResponse);
        }

        return getTeacherResponseList;
    }

}