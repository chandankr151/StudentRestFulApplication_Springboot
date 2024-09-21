package com.chandan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandan.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
