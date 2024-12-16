package com.example.dsstudent.dao.reposetories;

import com.example.dsstudent.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Long> {
    public List<Student> findByName(String name);

    public List<Student> findByDateNaissanceAndName(Date date, String name);
}
