package com.roof.haticestaj;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// POJO (Plain Old Java Object)
@Entity
public class Student {
    // variables (fields)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullname;
    private int studentId;

    @ManyToOne
    private School school;

    // constuctor
    public Student(String fullname, int studentId) {
        this.fullname = fullname;
        this.studentId = studentId;

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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
