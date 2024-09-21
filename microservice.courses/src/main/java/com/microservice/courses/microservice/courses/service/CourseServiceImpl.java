package com.microservice.courses.microservice.courses.service;

import com.microservice.courses.microservice.courses.client.StudentClient;
import com.microservice.courses.microservice.courses.dto.StudentDTO;
import com.microservice.courses.microservice.courses.entities.Course;
import com.microservice.courses.microservice.courses.http.response.StudentsByCourseResponse;
import com.microservice.courses.microservice.courses.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{
    @Autowired
    private ICourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentsByCourseResponse findStudentsByIdCourse(Long courseId) {
        //Consultar el curso
        Course course = courseRepository.findById(courseId).orElse(new Course());

        // Obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudentsByCourse(courseId);

        return StudentsByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .students(studentDTOList)
                .build();
    }
}
