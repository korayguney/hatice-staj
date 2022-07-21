package com.roof.haticestaj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// POJO (Plain Old Java Object)
@Entity
public class Student {
    // variables (fields)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullname;
    private int studentId;
    private String school;

    // constuctor
    public Student(String fullname, int studentId, String school) {
        this.fullname = fullname;
        this.studentId = studentId;
        this.school = school;
    }

    public Student(){}

    // getter&setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", studentId=" + studentId +
                ", school='" + school + '\'' +
                '}';
    }
}
