package com.chandan.service;

import java.util.List;

import com.chandan.entity.Student;

public interface StudentService {

	public Student createStudent(Student student);

	public List<Student> getAllStudent();

	public String deleteStudentById(int id);

	public Student updateStudent(int id,Student student);
}
