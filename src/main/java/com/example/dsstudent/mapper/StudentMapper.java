package com.example.dsstudent.mapper;

import com.example.dsstudent.dao.entities.Student;
import com.example.dsstudent.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDTO studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDTO fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDTO.class);
    }
}
