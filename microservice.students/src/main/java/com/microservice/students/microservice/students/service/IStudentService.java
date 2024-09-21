package com.microservice.students.microservice.students.service;

import com.microservice.students.microservice.students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    List<Student> findByIdCourse(Long idCourse);
}
