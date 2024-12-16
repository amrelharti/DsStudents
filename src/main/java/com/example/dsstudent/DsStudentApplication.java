package com.example.dsstudent;

import com.example.dsstudent.dto.StudentDTO;
import com.example.dsstudent.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DsStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsStudentApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentService studentService){
        return args ->{

        };
    }
}
