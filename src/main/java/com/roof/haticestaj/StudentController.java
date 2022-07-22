package com.roof.haticestaj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // dependency injection (DI) (IoC)
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    @PostConstruct
    public void init() {
        Student student1 = new Student("Koray Güney", 123);
        Student student2 = new Student("Hatice Çağlar", 124);

        School school1 = new School("FSM Universitesi", "Halic/İstanbul", 212255555L);
        student1.setSchool(school1);
        student2.setSchool(school1);

        schoolRepository.save(school1);
        studentRepository.save(student1);
        studentRepository.save(student2);

        System.out.println("All students saved to DB...");

    }

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

        return studentRepository.findAll();

    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentRepository.save(student);
       // students.add(student);
    }
}
