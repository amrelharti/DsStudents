package com.example.dsstudent.web;

import com.example.dsstudent.dto.StudentDTO;
import com.example.dsstudent.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {

    private StudentService studentService;
    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO student){
        return studentService.saveStudent(student);
    }
}
