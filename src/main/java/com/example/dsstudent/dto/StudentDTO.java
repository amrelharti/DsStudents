package com.example.dsstudent.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentDTO {
    String name;
    String email;
    Date dateNaissance;
}
