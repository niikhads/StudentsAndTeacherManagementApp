package org.example.dto.response;

import org.example.entity.enums.Subject;

import java.util.Objects;

public class GetTeacherResponse {

    private Long id;
    private Subject subject;
    private String name;
    private String surname;
    private String birthDate;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTeacherResponse that = (GetTeacherResponse) o;
        return Objects.equals(subject, that.subject) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject,id, name, surname, birthDate);
    }

    public String toString() {
        return id + ".subject" + subject + '\'' +
                 ", name ='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'';
    }


}