package org.example.entity;

import org.example.entity.enums.Subject;

import java.util.Map;
import java.util.Objects;

public class Teacher extends Human {

    private Long id;

    private Subject subject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", subject=" + subject +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) && subject == teacher.subject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, subject);
    }
}