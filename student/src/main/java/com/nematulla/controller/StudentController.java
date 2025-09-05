package com.nematulla.controller;

import com.nematulla.model.Student;
import com.nematulla.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();

    }
    @GetMapping("/search/{id}")
    public Student findById(@PathVariable  Long id){
        return studentService.findById(id);
    }
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

}
