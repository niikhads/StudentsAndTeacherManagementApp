package org.example.util;

public final class IdGeneratorUtil {

    private IdGeneratorUtil() {}

    private static Long studentId = 0L;

    private static Long teacherId = 0L;

    public static Long getNewStudentId() {
        return studentId++;
    }
    public static Long getNewTeacherId() {
        return teacherId++;
    }

}