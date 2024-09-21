package com.microservice.courses.microservice.courses.repository;

import com.microservice.courses.microservice.courses.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends CrudRepository<Course, Long> {
}
