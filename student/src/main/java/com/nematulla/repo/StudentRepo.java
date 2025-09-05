package com.nematulla.repo;

import com.nematulla.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long>
{
}
