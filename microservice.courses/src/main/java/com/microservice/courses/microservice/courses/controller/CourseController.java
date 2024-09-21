package com.microservice.courses.microservice.courses.controller;

import com.microservice.courses.microservice.courses.entities.Course;
import com.microservice.courses.microservice.courses.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Course course) {
        courseService.save(course);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent(){
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/search-students/{id}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findStudentsByIdCourse(id));
    }
}
