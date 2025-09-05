package com.nematulla.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;


    @Column(unique = true, nullable = false)
    private String enrollmentNumber;


    private LocalDate dateOfBirth;

    private String gender;

    @Column(unique = true, nullable = false)
    private String email;


    private String phone;


    private String address;


    private String department;


    private int yearOfStudy;


    private String collegeName;
}

