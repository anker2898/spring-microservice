package com.microservice.courses.microservice.courses.client;

import com.microservice.courses.microservice.courses.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-students", url = "localhost:8080/api/student")
public interface StudentClient {
    @GetMapping("/search-by-course/{id}")
    List<StudentDTO> findAllStudentsByCourse(@PathVariable Long id);
}
