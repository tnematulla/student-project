package com.nematulla.service;

import com.nematulla.model.Student;
import com.nematulla.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
     private StudentRepo studentRepo;
    public List<Student> getAllStudents() {
        return studentRepo.findAll();

    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student findById(Long id) {
        return studentRepo.findById(id).orElseThrow(()-> new RuntimeException("Student not found with id: " + id));
    }

    public Student updateStudent(Student student) {
        Student existing = studentRepo.findById(student.getId())
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + student.getId()));
        existing.setFullName(student.getFullName());
        existing.setEnrollmentNumber(student.getEnrollmentNumber());
        existing.setDateOfBirth(student.getDateOfBirth());
        existing.setGender(student.getGender());
        existing.setEmail(student.getEmail());
        existing.setPhone(student.getPhone());
        existing.setAddress(student.getAddress());
        existing.setDepartment(student.getDepartment());
        existing.setYearOfStudy(student.getYearOfStudy());
        existing.setCollegeName(student.getCollegeName());
        return studentRepo.save(existing);
    }

    public String deleteStudent(Long id) {
         studentRepo.deleteById(id);
         return "Student with id: " + id + " is deleted Successfully";
    }
}
