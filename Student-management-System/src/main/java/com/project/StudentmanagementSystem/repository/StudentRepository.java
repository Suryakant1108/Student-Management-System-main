package com.project.StudentmanagementSystem.repository;

import com.project.StudentmanagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
