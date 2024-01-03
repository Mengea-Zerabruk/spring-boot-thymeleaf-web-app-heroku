package com.mluetech.studentmanagementsystem.repository;

import com.mluetech.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
