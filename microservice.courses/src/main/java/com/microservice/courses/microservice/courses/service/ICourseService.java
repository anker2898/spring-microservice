package com.microservice.courses.microservice.courses.service;

import com.microservice.courses.microservice.courses.entities.Course;
import com.microservice.courses.microservice.courses.http.response.StudentsByCourseResponse;

import java.util.List;

public interface ICourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);
    StudentsByCourseResponse findStudentsByIdCourse(Long courseId);
}
