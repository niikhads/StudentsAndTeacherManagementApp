package org.example.util;

import org.example.dto.request.AddStudentRequest;
import org.example.dto.request.AddTeacherRequest;

import java.util.Scanner;

public final class RequestBuilderUtil {
    private RequestBuilderUtil() {
    }

    public static AddStudentRequest addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter student name:");
        String name = sc.nextLine();

        System.out.println("please enter student surname:");
        String surname = sc.nextLine();

        System.out.println("please enter student birhtdate (date format is -> day/monthNumber/year):");
        String birthdate = sc.nextLine();

        AddStudentRequest addStudentRequest = new AddStudentRequest();
        addStudentRequest.setName(name);
        addStudentRequest.setSurname(surname);
        addStudentRequest.setBirthDate(birthdate);

        return addStudentRequest;
    }

    public static AddTeacherRequest addTeacher() {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter teacher name:");
        String name = sc.nextLine();

        System.out.println("please enter teacher surname:");
        String surname = sc.nextLine();

        System.out.println("please enter tracher birhtdate (date format is -> day/monthNumber/year):");
        String birthdate = sc.nextLine();

        AddTeacherRequest addTeacherRequest = new AddTeacherRequest();
        addTeacherRequest.setName(name);
        addTeacherRequest.setSurname(surname);
        addTeacherRequest.setBirthDate(birthdate);

        return addTeacherRequest;
    }

}