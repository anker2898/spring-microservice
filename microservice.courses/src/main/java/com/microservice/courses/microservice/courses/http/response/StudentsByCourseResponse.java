package com.microservice.courses.microservice.courses.http.response;

import com.microservice.courses.microservice.courses.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentsByCourseResponse {
    private String courseName;
    private String teacher;
    private List<StudentDTO> students;
}
