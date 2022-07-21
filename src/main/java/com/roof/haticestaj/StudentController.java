package com.roof.haticestaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // dependency injection (DI) (IoC)
    @Autowired
    private StudentRepository repository;

    List<Student> students = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        //Student student1 = new Student("Hatice Çağlar", 110, "FSM Üniversitesi");
        //Student student2 = new Student("Koray Güney", 234, "Sabancı Üniversitesi");
        //Student student3 = new Student("Ayşe Türkmen", 456, "Beykent Üniversitesi");
        //students.add(student1);
        //students.add(student2);
        //students.add(student3);
        //return students;

        return repository.findAll();

    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return repository.save(student);
       // students.add(student);
    }
}
