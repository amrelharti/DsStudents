package com.example.dsstudent.service;

import com.example.dsstudent.dao.entities.Student;
import com.example.dsstudent.dao.reposetories.StudentRepo;
import com.example.dsstudent.dto.StudentDTO;
import com.example.dsstudent.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class StudentManager implements StudentService{

    StudentMapper studentMapper;
    StudentRepo studentRepo;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDto) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDto);
        student = studentRepo.save(student);
        studentDto = studentMapper.fromStudentToStudentDto(student);
        return studentDto;
    }

    @Override
    public boolean deleteStudent(Long id) {
        try {
            studentRepo.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<StudentDTO> getStudentByName(String name) {
        List<Student> students = studentRepo.findByName(name);
        List<StudentDTO> studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }

    @Override
    public List<StudentDTO> getStudentByDateNaissanceAndName(Date date, String name) {
        List<Student> students = studentRepo.findByDateNaissanceAndName(date,name);
        List<StudentDTO> studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }

    @Override
    public List<StudentDTO> saveStudents(List<StudentDTO> studentDTOS) {
        return null;
    }
}
