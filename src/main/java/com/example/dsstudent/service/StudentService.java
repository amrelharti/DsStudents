package com.example.dsstudent.service;

import com.example.dsstudent.dto.StudentDTO;

import java.util.Date;
import java.util.List;

public interface StudentService {
    StudentDTO saveStudent(StudentDTO studentDto);

    boolean deleteStudent(Long id);

    List<StudentDTO> getStudentByName(String name);

    List<StudentDTO> getStudentByDateNaissanceAndName(Date date, String name);

    List<StudentDTO> saveStudents(List<StudentDTO> studentDTOS);
}
